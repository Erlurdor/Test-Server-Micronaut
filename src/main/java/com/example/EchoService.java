package com.example;

import jakarta.inject.Singleton;

@Singleton
public class EchoService {
    public String echo(String str) {
        return str;
    }
}
