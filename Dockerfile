# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Java source file
COPY MyApp.java .

# Compile the Java source file
RUN javac MyApp.java

# Run the application
CMD ["java", "MyApp"]
