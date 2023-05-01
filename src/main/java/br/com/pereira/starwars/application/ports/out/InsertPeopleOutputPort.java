package br.com.pereira.starwars.application.ports.out;

import br.com.pereira.starwars.application.core.domain.People;

public interface InsertPeopleOutputPort {

    void insert(People people);

}
