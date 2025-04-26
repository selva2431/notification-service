package com.food.notification.entity;


import com.food.notification.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "NOTIFICATION_MESSAGE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationMessage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "message")
    private String message;

    @Column(name = "event_type")
    private EventType eventType;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_tsmp")
    private Date createTimestamp;
}
