FROM openjdk:8
EXPOSE 8080
ADD target/abc.jar abc.jar
ENTRYPOINT ["jar", "-jar","/abc.jar"]