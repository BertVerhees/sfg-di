package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetinServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();

        controller.setGreetingService(new GreetinServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}