package br.com.pereira.starwars.application.ports.in.people;

import br.com.pereira.starwars.application.core.domain.people.People;

public interface InsertPeopleInputPort {

    void insert(People people, Integer peopleId, Integer planetId);

}
