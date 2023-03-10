package console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberGuess implements ApplicationListener<ContextRefreshedEvent> {

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);


    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.info("Container ready for use.");
    }
}
