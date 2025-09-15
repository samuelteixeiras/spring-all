package com.sam.springwebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.server.reactive.ServerHttpRequest;
import reactor.core.publisher.Mono;

@RestController
public class IPController {

    @GetMapping("/ip")
    public Mono<String> getClientIP(ServerHttpRequest request) {
        return Mono.just(getIpAddress(request));
    }

    private String getIpAddress(ServerHttpRequest request) {
        String ipAddress = request.getHeaders().getFirst("X-Forwarded-For");
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddress().getAddress().getHostAddress();
        }
        return ipAddress;
    }
}
