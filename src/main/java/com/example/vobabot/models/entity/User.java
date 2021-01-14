package com.example.vobabot.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String chatId;
    private String userName;
    private String firstName;
    private String lastName;

    /*@Override
    public String toString() {
        return firstName + " " + lastName + "!";
    }*/
}
