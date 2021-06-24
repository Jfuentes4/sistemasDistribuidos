# Project Name

This is a basic Rest API server made in java, is a CRUD of a tasks (to do) using HTTServer and SQLite for manage the connections and the database. This was done by Jose Manuel Fuentes Mojica.

## Installation
In order to build the project, you will need to assemble the dependencies and then package the project into a jar:

```mvn assembly:assembly package```

then you can run the server with:

```java -jar target/rest-server-1.0-SNAPSHOT-jar-with-dependencies.jar```

## Usage
The API can respond to the following endpoints:

```GET localhost:8000/api/v1/todos```
```GET localhost:8000/api/v1/todos/:id```
```POST localhost:8000/api/v1/todos```
```PUT localhost:8000/api/v1/todos/:id```
```DELETE localhost:8000/api/v1/todos/:id```

Responds with the following JSON:

```
{
   id: 1,
   title: "First ToDo",
   completed: false,
}
```

## Examples

![image unavailable](/media/ss_1.png)

![image unavailable](/media/ss_2.png)

![image unavailable](/media/ss_3.png)

![image unavailable](/media/ss_4.png)

![image unavailable](/media/ss_5.png)

![image unavailable](/media/ss_6.png)


