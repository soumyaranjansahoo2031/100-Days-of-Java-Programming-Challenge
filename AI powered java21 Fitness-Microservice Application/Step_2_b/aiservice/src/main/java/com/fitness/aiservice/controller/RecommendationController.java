package com.fitness.aiservice.controller;

import com.fitness.aiservice.model.Activity;
import com.fitness.aiservice.model.Recommendation;
import com.fitness.aiservice.service.ActivityAiService;
import com.fitness.aiservice.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/recommendations")
public class RecommendationController {
    private final RecommendationService reccomendationService;

    private final ActivityAiService activityAiService;

    @GetMapping("/user/{userId}")
    public Flux<Recommendation> getUserRecommendation(@PathVariable String userId){
        return reccomendationService.getUserRecommendation(userId);
    }

    @GetMapping("/activity/{activityId}")
    public Mono<Recommendation> getActivityRecommendation(@PathVariable String activityId){
        return reccomendationService.getActivityRecommendation(activityId);
    }

    @PostMapping
    public Mono<Recommendation> generateRecommendation(@RequestBody Activity activity){
        return activityAiService.generateRecommendation(activity);
    }
}
