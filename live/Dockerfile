# the base image
FROM openjdk:17-jdk-alpine 

# copy the target file (jar or compile file in the docker image)
COPY target/live-0.0.1-SNAPSHOT.jar app-1.0.0.jar

# run jar files
ENTRYPOINT ["java", "-jar", "app-1.0.0.jar"]

# this is cool because you will be able to run this image without having java installed on the machine!