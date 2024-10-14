package by.javaguru.ws.emailnotification.handler;

import by.javaguru.ws.core.ProductCreatedEvent;
import by.javaguru.ws.emailnotification.exception.NonRetryableException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "product-created-events-topic")
public class ProductCreateEventHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaHandler
    public void handle(ProductCreatedEvent productCreatedEvent) {
        if (true) throw new NonRetryableException("Non retryable exception");
        LOGGER.info("received event: {}", productCreatedEvent.getTitle());
    }
}
