package com.example.vobabot.repositories;

import com.example.vobabot.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByChatId(String chatId);
}
