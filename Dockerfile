FROM gradle:7.2.0-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle build

FROM adoptopenjdk/openjdk17:alpine-jre
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]


