package com.example.vobabot.services;

import com.example.vobabot.models.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getByChatId(String chatId);
    User create(User user);
    User update(User user);
    boolean delete(String chatId);
}
