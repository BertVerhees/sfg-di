package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();

        controller.setGreetingService(new ConstructorGreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}