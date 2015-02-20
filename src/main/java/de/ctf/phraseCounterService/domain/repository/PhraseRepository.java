package de.ctf.phraseCounterService.domain.repository;

import de.ctf.phraseCounterService.domain.Phrase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by fgrothe on 20.02.2015.
 */
@RepositoryRestResource(collectionResourceRel = "phrase", path = "phrase")
public interface PhraseRepository extends MongoRepository<Phrase, String> {
}
