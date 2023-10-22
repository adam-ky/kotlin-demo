FROM eclipse-temurin:17-jdk-focal

WORKDIR /app

# Copy the application source code
COPY . .

# Build the application using Gradle Kotlin DSL (assumes a non-standard project structure)
RUN ./gradlew clean build -x test

# Set the entry point for running the application
CMD ["java", "-jar", "build/libs/kotlin-demo-0.0.1-SNAPSHOT.jar"]
