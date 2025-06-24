# Etapa 1: build con Maven
FROM maven:3.9.6-amazoncorretto-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: usar solo el jar final
FROM amazoncorretto:17-alpine-jdk
COPY --from=build /app/target/Portfolio-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]