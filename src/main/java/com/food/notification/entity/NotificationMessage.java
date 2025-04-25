package com.food.notification.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "NOTICATION_MESSAGE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationMessage implements Serializable {
}
