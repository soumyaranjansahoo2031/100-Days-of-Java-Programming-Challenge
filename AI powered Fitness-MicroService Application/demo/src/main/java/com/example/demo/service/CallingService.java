package com.example.demo.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CallingService {

    private final GeminiService geminiService;

    public CallingService(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    public Mono<String> processRequest() {

        return geminiService.fetchData()
                .map(response -> "Response from API:\n" + response);
    }
}