FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} accbank-api.jar

EXPOSE 8443

ENTRYPOINT ["java", "-Duser.language=pt", "-Duser.country=BR", "-jar", "accbank-api.jar"]
