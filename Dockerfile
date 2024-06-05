FROM eclipse-temurin:21-jre

EXPOSE 8080

RUN mkdir /app

COPY ./target/*.jar /app/application.jar

CMD ["java","-jar","/app/application.jar"]