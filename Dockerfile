# Use official OpenJDK image as base
FROM openjdk:21

EXPOSE 8080
# Copy built JAR to container
COPY target/springBoot-docker-using-maven.jar springBoot-docker-using-maven.jar

# Run the application
ENTRYPOINT ["java", "-jar", "springBoot-docker-using-maven.jar"]

