FROM amazoncorretto:11-alpine-jdk
MAINTAINER nathan
COPY target/projet-0.0.1-SNAPSHOT.jar projet-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","projet-0.0.1-SNAPSHOT.jar"]