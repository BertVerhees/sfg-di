package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService constructorGreetingService;
    //no autowired necessary on constructor injected controllers
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.constructorGreetingService = greetingService;
    }

    public String getGreeting(){
        return constructorGreetingService.sayGreeting();
    }
}
