# File: backend/service-discovery/Dockerfile
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY target/service-discovery-*.jar app.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app/app.jar"]