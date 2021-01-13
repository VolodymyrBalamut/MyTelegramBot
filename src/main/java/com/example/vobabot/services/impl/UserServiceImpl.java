package com.example.vobabot.services.impl;

import com.example.vobabot.models.User;
import com.example.vobabot.repositories.UserRepository;
import com.example.vobabot.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getByChatId(String chatId) {
        return userRepository.findByChatId(chatId);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean delete(String chatId) {
        return true;
    }
}
