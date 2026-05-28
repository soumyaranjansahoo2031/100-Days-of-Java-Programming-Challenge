package com.fitness.aiservice.service;

import com.fitness.aiservice.model.Activity;
import com.fitness.aiservice.model.Recommendation;
import com.fitness.aiservice.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {

    private final ActivityAiService activityAiService;
    private final RecommendationRepository recommendationRepository;

    @KafkaListener(topics = "${kafka.topic.name}",groupId = "activity-processor-group")
    public void processActivity(Activity activity){
        log.info("received activity for processing:{} ",activity.getUserId());
//        Mono<Recommendation> recommendationMono =  activityAiService.generateRecommendation(activity);
        log.info("trying to save");
//        recommendationRepository.save(recommendationMono);
        activityAiService.generateRecommendation(activity)
                .flatMap(recommendationRepository::save)
                .subscribe(
                        savedRecommendation -> {

                            log.info(
                                    "Recommendation saved successfully for user: {}",
                                    savedRecommendation.getUserId()
                            );
                        },
                        error -> {

                            log.error(
                                    "Error processing activity for user: {}",
                                    activity.getUserId(),
                                    error
                            );
                        }
                );
    }
}
