package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class EchoServiceTest {
    @Inject
    private EchoService echoService;

    @Test
    void echo() {
        String expectedString = "It's expected string";
        String actualString = echoService.echo(expectedString);

        assertEquals(expectedString, actualString);
    }
}