# spring-boot-dockerize
How to Dockerize Spring Boot Application 

# Build Docker Image 
$ docker build -t spring-boot-docker.jar .

# Check Docker Image 
$ docker image ls

# Run Docker Image 
$ docker run -p 9090:8080 spring-boot-docker.jar

In the run command, we have specified that the port 8080 on the container should be mapped to the port 9090 on the Host OS.

# List all containers (only IDs)
docker ps -aq

# List all containers
docker container ps

# List all active containers
docker container ls -a

# Stop all running containers
docker stop $(docker ps -aq)

#Stop a particular container

docker container stop <<container_id>>

# Start a container
docker container start <<container_id>>

# Remove all containers
docker rm $(docker ps -aq)

# Remove a particular container
docker container rm <<container_id>>

# To force delete it add -f before the container id
docker container rm -f <<container_id>>

# Remove multiple containers
docker container rm <<container_id_1>> <<container_id_2>>

# To force delete it add -f before the container id
docker container rm -f <<container_id_1>> <<container_id_2>>

# ========Image Commands========================

# List all images
docker image ls

# Remove all images
docker rmi $(docker images -q)

# Remove all unused images
docker image prune -a


# Remove a particular image
docker image rmi <<image_id>>

# To force delete it add -f before the image id.
docker image rmi -f <<image_id>>

# image will tag to push to DockerHub
docker tag spring-bootdocker.jar prk54989/spring-bootdocker.jar

# Image push to DockerHub
docker push prk54989/spring-bootdocker.jar

# Docker Image pull from DockerHub
docker pull prk54989/spring-bootdocker.jar

# run Docker image from DockerHub
docker run -p 9090:8080 prk54989/spring-bootdocker.jar

# Build and push Spring Boot Docker images using Maven plugin
-JRE set in Jenkins : Go to Jenkins -> Manage Jenkins -> Configure System -> Global properties Check the box 'Environment variables' and add the JAVA_HOME path



