# spring-boot-dockerize
How to Dockerize Spring Boot Application 

# Build Docker Image 
$ docker build -t spring-boot-docker.jar .

# Check Docker Image 
$ docker image ls

# Run Docker Image 
$ docker run -p 9090:8080 spring-boot-docker.jar

In the run command, we have specified that the port 8080 on the container should be mapped to the port 9090 on the Host OS.
http://localhost:9090/message

# image will tag to push to DockerHub
docker tag spring-boot-docker.jar prk54989/spring-boot-docker.jar

#Image push to DockerHub
docker push prk54989/spring-boot-docker.jar

#Docker Image pull from DockerHub
docker pull prk54989/spring-boot-docker.jar

#run Docker image from DockerHub
docker run -p 9090:8080 prk54989/spring-boot-docker.jar
