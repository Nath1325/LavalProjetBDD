FROM maven:3.6.3 AS maven
WORKDIR /home/maven/src
COPY . /home/maven/src
RUN mvn package
FROM openjdk:11 as finalApp
ENTRYPOINT ["sudo", "mkdir", "/app/"]
WORKDIR app
COPY --from=maven /home/maven/src/target/projet-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/projet-0.0.1-SNAPSHOT.jar"]