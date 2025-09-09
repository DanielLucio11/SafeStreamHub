// File: backend/service-discovery/src/main/java/com/safestreamhub/discovery/ServiceDiscoveryApplication.java
package com.safestreamhub.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Servidor de descoberta de serviços usando Netflix Eureka.
 * Todos os microserviços se registram aqui para descoberta dinâmica.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryApplication.class, args);
    }
}