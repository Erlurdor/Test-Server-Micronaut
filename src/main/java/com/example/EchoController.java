package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller
public class EchoController {
    @Inject
    private EchoService echoService;

    @Get("/echo/{str}")
    public String echo(String str) {
        return echoService.echo(str);
    }
}
