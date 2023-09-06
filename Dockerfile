FROM openjdk:17-jre-slim
WORKDIR /app
COPY . .
RUN gradle build

FROM openjdk:17-jre-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]


