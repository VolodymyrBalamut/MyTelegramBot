package com.example.vobabot.repositories;

import com.example.vobabot.models.entity.UsersMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMessageRepository extends JpaRepository<UsersMessage, Long> {
    UsersMessage findUsersMessageByMessageId(Integer messageId);
}
