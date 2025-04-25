package com.food.notification.repository;

import com.food.notification.entity.NotificationMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticationMessageRepository extends JpaRepository<NotificationMessage, Long> {
}
