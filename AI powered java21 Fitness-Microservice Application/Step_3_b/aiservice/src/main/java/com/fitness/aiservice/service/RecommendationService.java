package com.fitness.aiservice.service;

import com.fitness.aiservice.model.Recommendation;
import com.fitness.aiservice.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final RecommendationRepository recommendationRepository;

    public Flux<Recommendation> getUserRecommendation(String userId) {
        return recommendationRepository.findByUserId(userId);
    }

    public Mono<Recommendation> getActivityRecommendation(String activityId) {
        Mono<Recommendation> recommendation = recommendationRepository.findByActivityId(activityId);

        if(recommendation == null){
            throw new RuntimeException(
                    "No recommendation found for activity: " + activityId);
        }

        return recommendation;
    }
}
