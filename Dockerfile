# Use a specific version of OpenJDK 11 image as a base for stability
FROM openjdk:11.0.11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Expose the port that the Spring Boot app will run on
EXPOSE 8082

# Copy the built .jar file from the target directory into the container
COPY target/DevOps_Project-1.0.jar /app/DevOps_Project-1.0.jar

# Set the entry point for running the application
ENTRYPOINT ["java", "-jar", "/app/DevOps_Project-1.0.jar"]

