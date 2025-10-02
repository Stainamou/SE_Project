FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/SE_Project-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]