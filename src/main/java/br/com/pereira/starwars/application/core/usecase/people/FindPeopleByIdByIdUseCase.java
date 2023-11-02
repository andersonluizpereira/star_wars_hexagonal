package br.com.pereira.starwars.application.core.usecase.people;

import br.com.pereira.starwars.application.core.domain.people.People;
import br.com.pereira.starwars.application.ports.in.people.FindPeopleByIdInputPort;
import br.com.pereira.starwars.application.ports.out.people.FindPeopleByIdOutputPort;

public class FindPeopleByIdByIdUseCase implements FindPeopleByIdInputPort {

    private final FindPeopleByIdOutputPort findPeopleByIdOutputPort;

    public FindPeopleByIdByIdUseCase(
            FindPeopleByIdOutputPort findPeopleByIdOutputPort
    ) {
        this.findPeopleByIdOutputPort = findPeopleByIdOutputPort;
    }

    @Override
    public People find(Integer peopleId) {
        var planet = findPeopleByIdOutputPort.find(peopleId);
        return planet;
    }

}

