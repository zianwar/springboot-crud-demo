# springboot-crud-demo

Spring Boot CRUD demo is a demonstrating how to implement simple CRUD operations with a Product entity, it was based on a school presentation, the full blog article can be found at http://zianwar.com/spring

## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

## Database configuration 
Create a MySQL database with the name `springbootdb`and this crednetials to `/resources/application.properties` the default ones are :

```
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## Usage 
Run the project and head out to [http://localhost:8080](http://localhost:8080)
