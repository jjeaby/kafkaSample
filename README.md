# kafkaSample
 - 이 프로젝트는 Spring Boot Kafka Template 샘플 프로젝트 입니다.
 
 
# 사용 방법 
* Spring Boot 서버를 실행합니다. 
``` 
mvn spring-boot:run 
```
* http://localhost:8080/send 주소를 브라우저로 접속 하면 kafka Producer 가 호출 되고 이를 Consumer 가 받아 로그를 남깁니다. 

```$xslt
Topic: [di-jj-topic] messageKey Message: [messageKey]
Topic: [di-jj-topic] Received Message: [Message] from partition: [0]
Topic: [me-jj-topic] messageKey Message: [message-key]
Topic: [me-jj-topic] Received Message: [me-jj-topic message] from partition: [0]
Topic: [di-jj-topic] messageKey Message: [message-key]
Topic: [di-jj-topic] Received Message: [di-jj-topic message] from partition: [0]
```

