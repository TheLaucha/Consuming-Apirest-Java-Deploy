
FROM registry.access.redhat.com/ubi8/openjdk-17:1.15-1.1682053058 AS builder

RUN mkdir project
WORKDIR /home/jboss/project
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src src
RUN mvn package -Dmaven.test.skip=true

RUN grep version target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-version
RUN grep artifactId target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-id

RUN mv target/$(cat .env-id)-$(cat .env-version).jar target/export-run-artifact.jar

FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:1.15-1.1682053056

COPY --from=builder /home/jboss/project/target/export-run-artifact.jar  /deployments/export-run-artifact.jar

ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgresql:5432/postgres
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=Lamp054
EXPOSE 8082
ENTRYPOINT ["/opt/jboss/container/java/run/run-java.sh", "--server.port=8082"]

