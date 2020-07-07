# kafkaSample
 - 이 프로젝트는 Spring Boot Kafka Template 샘플 프로젝트 입니다.
 
 
# 사용 방법 
* Spring Boot 서버를 실행합니다. 
``` 
mvn spring-boot:run 
```
* http://localhost:8080/send 주소를 브라우저로 접속 하면 kafka Producer 가 호출 되고 이를 Consumer 가 받아 로그를 남깁니다. 

```$xslt
Sent message=[medium -> jjeaby message] with offset=[2]
Sent message=[company -> jjeaby message] with offset=[2]
Topic: [company-jjeaby-topic] messageKey Message: [message key company]
Topic: [medium-jjeaby-topic] messageKey Message: [message key medium]
Topic: [company-jjeaby-topic] Received Message: [company -> jjeaby message] from partition: [0]
Topic: [medium-jjeaby-topic] Received Message: [medium -> jjeaby message] from partition: [0]
```

