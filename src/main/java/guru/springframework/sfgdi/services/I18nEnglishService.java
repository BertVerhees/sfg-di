package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("I18nService")
public class I18nEnglishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - UK";
    }
}
