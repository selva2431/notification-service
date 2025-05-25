package com.food.notification.entity;

import com.food.notification.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "email_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailConfig implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "host",nullable = false)
    private String host;

    @Column(name = "port", nullable = false)
    private int port;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "protocol", nullable = false)
    private String protocol;

    @Column(name = "from_email", nullable = false)
    private String fromEmail;

    @Column(name = "event_type", nullable = false)
    private EventType eventType;

    @Column(name = "is_active", nullable = false , length = 1)
    private String isActive;

}
