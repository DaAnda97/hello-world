# Hello World Example
This project demonstrates how to run a spring boot application within a Docker Container.

Requirements: 
- Java 21 (f.ex. `eclipse temurin`)
- Docker

## 1. Build Project
This project uses Maven as package manager. 
It's wrapper ensures that each team member uses the same version.

``` bash
./mvnw clean package
```

This will generate an executable jar within `./target` folder. You can run this jar using

``` bash
java -jar target/hello-world-0.1.0.jar 
# visit http://localhost:8080/hello
```
``` bash
PORT=8081 HELLO_MESSAGE="hello world again" java -jar target/hello-world-0.1.0.jar
# visit http://localhost:8081/hello
```

## 2. Build Docker Image

``` bash
docker build . -t "hello:0.1.0"
```

``` bash
docker run hello:0.1.0 -p 8080:8080
```

```
docker compose up -d
```