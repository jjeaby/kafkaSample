package ml.jjeaby.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.template.medium-jjeaby-topic}", containerFactory = "meJJKafkaListenerContainerFactory", groupId = "${spring.kafka.consumer.medium-jjeaby-group-id}")
    public void listenMeJJTopic(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String messageKey) throws Exception {
        log.info("Topic: [medium-jjeaby-topic] messageKey Message: [" + messageKey + "]");
        log.info("Topic: [medium-jjeaby-topic] Received Message: [" + message + "] from partition: [" + partition + "]");
    }

    @KafkaListener(topics = "${spring.kafka.template.company-jjeaby-topic}", containerFactory = "diJJKafkaListenerContainerFactory", groupId = "${spring.kafka.consumer.company-jjeaby-group-id}")
    public void listenDiJJTopic(
            @Payload String message,
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String messageKey) throws Exception {
        log.info("Topic: [company-jjeaby-topic] messageKey Message: [" + messageKey + "]");
        log.info("Topic: [company-jjeaby-topic] Received Message: [" + message + "] from partition: [" + partition + "]");
    }
}