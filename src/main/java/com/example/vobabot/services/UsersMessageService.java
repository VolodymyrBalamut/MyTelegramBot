package com.example.vobabot.services;

import com.example.vobabot.models.entity.UsersMessage;

import java.util.List;

public interface UsersMessageService {
    List<UsersMessage> getAll();
    UsersMessage getMessageById(Integer id);
    UsersMessage create(UsersMessage message);
    UsersMessage update(UsersMessage message);
    boolean delete(Long id);
}
