package de.ctf.phraseCounterService.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by fgrothe on 20.02.2015.
 */
public class Phrase {

//    @Id
//    private String id;

//    @Indexed(unique=true)
    @Id
    private String phrase;

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}
