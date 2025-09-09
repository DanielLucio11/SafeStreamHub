// File: backend/api-gateway/src/main/java/com/safestreamhub/apigateway/config/GatewayConfig.java
package com.safestreamhub.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("auth-service", r -> r.path("/auth/**")
                .uri("lb://AUTH-SERVICE"))
            .route("media-service", r -> r.path("/media/**", "/upload/**", "/files/**")
                .uri("lb://MEDIA-SERVICE"))
            .route("content-service", r -> r.path("/content/**", "/stream/**", "/watch/**")
                .uri("lb://CONTENT-SERVICE"))
            .build();
    }
}