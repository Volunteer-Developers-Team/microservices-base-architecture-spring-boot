FROM openjdk:8-jdk-alpine

MAINTAINER Ramazan Sakin <ramazansakin63@gmail.com>
ADD target/*.jar discovery-service-1.0-RELEASE.jar

ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=docker", "/discovery-service-1.0-RELEASE.jar"]

EXPOSE 8761