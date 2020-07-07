package ml.jjeaby.application;

import ml.jjeaby.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan("ml.jjeaby")
public class KafkaSampleApplication {
    @Autowired
    KafkaProducer kafkaProducer;

    @RequestMapping(method = RequestMethod.GET, path = "/send")
    String send() {
        kafkaProducer.sendMessage("medium-jjeaby-topic", "message key medium", "medium -> jjeaby message");
        kafkaProducer.sendMessage("company-jjeaby-topic", "message key company", "company -> jjeaby message");
        return "Kafka Produce!!!";
    }

    public static void main(String[] args) {

        SpringApplication.run(KafkaSampleApplication.class, args);
    }
}
