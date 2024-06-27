FROM maven:3.9.8-amazoncorretto-21 AS maven
LABEL authors="hendisantika"
LABEL MAINTAINER="hendisantika@yahoo.co.id"

WORKDIR /opt/book-service
COPY . /opt/book-service
RUN mvn clean install

FROM amazoncorretto:21-alpine-jdk

ARG JAR_FILE=book-service.jar

WORKDIR /opt/book-service

COPY --from=maven /opt/book-service/target/${JAR_FILE} /opt/book-service/

ENTRYPOINT ["java","-jar","book-service.jar"]
