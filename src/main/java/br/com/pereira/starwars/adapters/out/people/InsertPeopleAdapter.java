package br.com.pereira.starwars.adapters.out.people;

import br.com.pereira.starwars.adapters.out.repository.PeopleRepository;
import br.com.pereira.starwars.adapters.out.repository.mapper.people.PeopleEntityMapper;
import br.com.pereira.starwars.application.core.domain.people.People;
import br.com.pereira.starwars.application.ports.out.people.InsertPeopleOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertPeopleAdapter implements InsertPeopleOutputPort {

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private PeopleEntityMapper peopleEntityMapper;

    @Override
    public void insert(People people) {
        var peopleEntity = peopleEntityMapper.toPeopleEntity(people);
        peopleRepository.save(peopleEntity);
    }

}