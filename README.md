# simple docker-compose application: spring-boot & mongodb

spring-boot application source: [./simple_spring_boot_app](./simple_spring_boot_app)

## How to run
- run docker-compose `docker-compose up`
- spring-boot service will connect automatically to mongodb thanks to internal port mapping from docker-compose.
- spring-boot application `demo.jar` will create an instance of collection `Person` get it from the mongodb.
- You can test the persistance result from but sending get request to `localhost:8081/api/person/get`
```
[MohamedAmin@samet spring-boot]$ curl -X GET localhost:8081/api/person/get | python -m json.tool
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   445    0   445    0     0    585      0 --:--:-- --:--:-- --:--:--   585
[
    {
        "firstName": "Good",
        "id": {
            "counter": 5653305,
            "date": "2018-12-17T14:00:25.000+0000",
            "machineIdentifier": 4263416,
            "processIdentifier": 1,
            "time": 1545055225000,
            "timeSecond": 1545055225,
            "timestamp": 1545055225
        },
        "lastName": "Person"
    }
]
```
