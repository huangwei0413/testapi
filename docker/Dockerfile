FROM openjdk:8-jdk-alpine
ADD ./build/libs/testapi-0.0.1-SNAPSHOT.jar testapi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java"]
CMD ["-Djava.security.egd=file:/dev/./urandom", "-jar", "/testapi-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
