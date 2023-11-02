package br.com.pereira.starwars.adapters.out.people;

import br.com.pereira.starwars.adapters.out.client.planet.FindPeopleByIdCodeClient;
import br.com.pereira.starwars.adapters.out.client.planet.mapper.PeopleResponseMapper;
import br.com.pereira.starwars.application.core.domain.people.People;
import br.com.pereira.starwars.application.ports.out.people.FindPeopleByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindPeopleByIdAdapter implements FindPeopleByIdOutputPort {

    @Autowired
    private FindPeopleByIdCodeClient findPeopleByIdCodeClient;

    @Autowired
    private PeopleResponseMapper peopleEntityMapper;

    @Override
    public People find(Integer peopleId) {
        var peopleResponse = findPeopleByIdCodeClient.find(peopleId);
        return peopleEntityMapper.toPeople(peopleResponse);
    }

}