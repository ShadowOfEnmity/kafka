package by.javaguru.ws.emailnotification.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "processed_events")
public class ProcessedEventEntity {
    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Column(nullable = false, unique = true)
    private String messageId;

    @Column(nullable = false)
    private String productId;

    public ProcessedEventEntity() {
    }

    public ProcessedEventEntity(String messageId, String productId) {
        this.messageId = messageId;
        this.productId = productId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
