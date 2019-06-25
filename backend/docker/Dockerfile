FROM openjdk:8

RUN mkdir -p /usr/src/mvc-app

COPY spring-boot-rest-postgresql-0.0.1-SNAPSHOT.jar /usr/src/mvc-app

WORKDIR /usr/src/mvc-app

## THE LIFE SAVER
ADD https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh

## Launch the wait tool and then your application
CMD ["./wait-for-it.sh", "--timeout=0", "postgres:5432", "--", "java", "-jar", "spring-boot-rest-postgresql-0.0.1-SNAPSHOT.jar"]

