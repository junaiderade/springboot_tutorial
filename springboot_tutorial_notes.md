# README

## general
- you are following this tutorial:
https://www.youtube.com/watch?v=Nefd6qdpdSI
- the container is a jar file inside an image

## prereqs
- docker installed and running
- have java 17 installed on the machine and used (use java --version to check)
- VSCode Spring Initializr Java Support Extension
- VSCode Extension Pack for Java
- TablePlus app
- Postman

## how you set up project using VSCode
1. right click
2. New Java Project
3. choose Spring Boot
4. choose Maven
5. chooose 3.04 (any 3.x should work)
6. choose Java
7. use com.example
7. type live
8. chooseJar
9. 17
10. spring web, spring data jpa sql, Postgres SQL driver
11. choose this folder to generate into it

## how to connect Java to Dockerized Postgres Table
- go to application.properties in resources and edit that

## how to test
- go to UserController.java and run teh java from play button dropdown!
- in postman, use get request to localhost:8080/api/users
- do mvn clean package

# Errors

## on clicking play as soon as you create project from LiveApplication.java file
- this happens because it is expecting a connection SQL
- we will run postgres in a container
- you used docker compose file to make a postgres container
- you used tableplus to access the table you made

## on clicking play you get an error that you don't have springboot
- you updated java version
- instead of clicking play, use dropdown on the LiveApplication.java file and select run java

## org.postgresql.util.PSQLException: ERROR: relation "users" does not exist
- you had mispelling in your application.properties

# Terminal Commands

## How to remove a specific commit

git rebase -i HEAD~5 (this brings up the last 5 commits in vim)
press d and then delete the line you want
git push --force

## JAR File
A JAR (Java ARchive) file is a package file format typically used to aggregate many Java class files and associated metadata and resources (text, images, etc.) into one file for distribution. These files are archive files that use the ZIP format to bundle and compress the contents. JAR files are a fundamental distribution mechanism for Java applications, facilitating the deployment and execution of software written in the Java programming language.

## how to update java version
brew install openjdk@17
sudo ln -sfn /usr/local/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk

## how to run docker compost file
docker compose up -d java_db
the -d stands for detatched

## how to see all running and not running containers
docker ps -a

## how to see all docker images
docker images

## how to pull docker images
docker pull openjdk:17
docker pull maven:3.8.4-openjdk-17

## how to run a docker image
docker run -it -v /Users/junaidmohamed/Documents/code/in_progress/springboot_tutorial openjdk:17 /bin/bash
use exit to exit

## How to check java version

java --version

## How to check if docker is installed on the system

docker --version

## How to start docker service

sudo service docker start

# Definitions

## Java Annotations
a form of metadata that provide data about a program but are not part of the program itself. Annotations have no direct effect on the operation of the code they annotate. However, they can be used by the compiler or at runtime by various tools and frameworks to generate code, configure frameworks, or apply certain checks. 

## TablePlus app
a sql app for multiple databases

## Docker Compose File
a file to define containers which are basically services

## Hibernate
Hibernate is an open-source Object-Relational Mapping (ORM) framework for Java. It provides a framework for mapping an object-oriented domain model to a relational database, allowing developers to more easily manage database operations and data persistence in their Java applications. Hibernate abstracts away much of the underlying database operations, such as CRUD (Create, Read, Update, Delete) operations, making it easier for developers to work with databases without having to write extensive SQL queries.

## Docker Container
A container is a running instance of an image. You can have many containers running from the same image.

## Docker Image
An image is like a blueprint for your application, containing all the dependencies and instructions needed to create a running instance.

## Docker Volume
A volume is used for data persistence and sharing between containers, making sure your data is saved even when containers are stopped or removed.

## Java Build Automation Tool
A build automation tool is a software application that automates key aspects of the software development process, particularly the process of compiling source code into binary code, packaging binary code, and running automated tests. The primary goal of build automation tools is to reduce the complexity and repetitive nature of these tasks, which are traditionally done manually, and to increase efficiency, consistency, and reliability in the software build process.

## Dockerfile
A Dockerfile is a text document that contains a set of instructions for Docker to automatically build an image. An image created using a Dockerfile can then be used to run containers. 

## JAR file
A JAR file (Java ARchive) is a package file format typically used to aggregate many Java class files and associated metadata and resources (such as text, images, and XML files) into one file for distribution.

# Questions

# Trash