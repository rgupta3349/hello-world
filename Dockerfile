FROM openjdk:8-jdk-alpine
#VOLUME /tmp
COPY /home/pipeline/80cb328b-9c10-4ecb-9258-42173ef681ef/target/hello-world-0.0.1-SNAPSHOT.jar hello-world.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hello-world.jar"]
