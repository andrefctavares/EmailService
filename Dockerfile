FROM openjdk:latest
VOLUME /tmp
ADD target/EmailService-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]