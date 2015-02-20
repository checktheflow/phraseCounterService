package de.ctf.phraseCounterService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by fgrothe on 20.02.2015.
 */
@EnableAutoConfiguration
@EnableMongoRepositories
@ComponentScan("de.ctf.phraseCounterService")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
