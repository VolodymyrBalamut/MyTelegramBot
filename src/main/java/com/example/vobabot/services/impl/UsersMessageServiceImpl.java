package com.example.vobabot.services.impl;

import com.example.vobabot.models.entity.UsersMessage;
import com.example.vobabot.repositories.UsersMessageRepository;
import com.example.vobabot.services.UsersMessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersMessageServiceImpl implements UsersMessageService {
    private final UsersMessageRepository messageRepository;

    public List<UsersMessage> getAll() {
        return messageRepository.findAll();
    }

    @Override
    public UsersMessage getMessageById(Integer id) {
        return messageRepository.findUsersMessageByMessageId(id);
    }

    @Override
    public UsersMessage create(UsersMessage user) {
        return messageRepository.save(user);
    }

    @Override
    public UsersMessage update(UsersMessage user) {
        return messageRepository.save(user);
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }


}
