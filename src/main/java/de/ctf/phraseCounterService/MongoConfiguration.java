package de.ctf.phraseCounterService;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created by fgrothe on 20.02.2015.
 */
@Configuration
public class MongoConfiguration {
    @Bean
    public MongoDbFactory mongoDBFactory() throws Exception {
        UserCredentials userCredentiials = new UserCredentials("bongo", "mongo");
        return new SimpleMongoDbFactory(new MongoClient(), "phraseCount");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDBFactory());
    }
}
