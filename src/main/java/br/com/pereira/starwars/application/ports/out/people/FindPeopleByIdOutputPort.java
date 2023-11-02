package br.com.pereira.starwars.application.ports.out.people;

import br.com.pereira.starwars.application.core.domain.people.People;

public interface FindPeopleByIdOutputPort {

    People find(Integer id);

}
