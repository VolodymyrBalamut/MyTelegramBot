package com.example.vobabot.model;

import lombok.Getter;
import lombok.Setter;
import org.telegram.telegrambots.meta.api.objects.Message;

@Getter
@Setter
public class User {
    private String userName;
    private String firstName;
    private String lastName;

    public User(Message msg){
        this.userName = msg.getFrom().getUserName();
        this.firstName = msg.getFrom().getFirstName();
        this.lastName = msg.getFrom().getLastName();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "!";
    }
}
