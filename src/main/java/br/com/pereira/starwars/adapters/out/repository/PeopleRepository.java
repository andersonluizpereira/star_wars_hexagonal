package br.com.pereira.starwars.adapters.out.repository;

import br.com.pereira.starwars.adapters.out.repository.entity.people.PeopleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeopleRepository extends MongoRepository<PeopleEntity, String> {
}
