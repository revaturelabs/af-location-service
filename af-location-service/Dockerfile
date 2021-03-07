FROM openjdk:8-jre
ARG JAR_FILE=build/libs/af-location-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]