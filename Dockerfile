FROM openjdk:11.0
COPY target/my-area.jar my-area.jar
CMD java -jar my-area.jar