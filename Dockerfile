FROM jdk8
EXPOSE 8080
ADD target/gitlab.jar gitlab.jar
ENTRYPOINT ["jar", "-jar","/gitlab.jar"]