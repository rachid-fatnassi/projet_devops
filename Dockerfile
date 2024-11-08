# Use OpenJDK 11 image as a base
FROM openjdk:11-jdk-slim

# Expose the port that the Spring Boot app will run on
EXPOSE 8082

# Add the built .jar file from the target directory
ADD target/DevOps_Project-1.0.jar DevOps_Project-1.0.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/DevOps_Project-1.0.jar"]

