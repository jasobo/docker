# syntax=docker/dockerfile:1

FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/owndocker-1.0.0-SNAPSHOT.jar /app/dockerselftest.jar

ENV SPRING_DATASOURCE_URL=jdbc:h2:tcp://h2-db:9092/./testdb
ENV SPRING_DATASOURCE_USERNAME=user
ENV SPRING_DATASOURCE_PASSWORD=password

EXPOSE 8080
ENTRYPOINT ["java","-jar","dockerselftest.jar"]
