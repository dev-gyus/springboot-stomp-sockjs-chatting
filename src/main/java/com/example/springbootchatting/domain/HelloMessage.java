package com.example.springbootchatting.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HelloMessage {
    private String name;

    public HelloMessage(String name) {
        this.name = name;
    }
}
