FROM maven:3.6-jdk-12-alpine as mvn_build
COPY . .
RUN mvn clean package

FROM openjdk:12-jdk-alpine
WORKDIR /app
COPY --from=mvn_build target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]