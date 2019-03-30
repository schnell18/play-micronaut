package org.jjhome.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("hello")
public class HelloController {
    private long invocations = 0;
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        System.out.printf("hello invoked %d times \n", ++invocations);
        return "Hello World";
    }
}
