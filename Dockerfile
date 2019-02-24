FROM openjdk:8-jre-alpine
ADD ./target/demo-0.0.1-SNAPSHOT.jar /opt/demo-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/opt/demo-0.0.1-SNAPSHOT.jar"]
EXPOSE 9090
