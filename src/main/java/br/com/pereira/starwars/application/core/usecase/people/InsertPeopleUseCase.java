package br.com.pereira.starwars.application.core.usecase.people;

import br.com.pereira.starwars.application.core.domain.people.People;
import br.com.pereira.starwars.application.ports.in.people.InsertPeopleInputPort;
import br.com.pereira.starwars.application.ports.out.planet.FindPlanetByIdOutputPort;
import br.com.pereira.starwars.application.ports.out.people.InsertPeopleOutputPort;
import br.com.pereira.starwars.application.ports.out.SendIdForValidationOutputPort;

public class InsertPeopleUseCase implements InsertPeopleInputPort {

    private final FindPlanetByIdOutputPort findPlanetByIdOutputPort;

    private final InsertPeopleOutputPort insertPeopleOutputPort;

    private final SendIdForValidationOutputPort sendIdForValidationOutputPort;

    public InsertPeopleUseCase(
            FindPlanetByIdOutputPort findPlanetByIdOutputPort,
            InsertPeopleOutputPort insertPeopleOutputPort,
            SendIdForValidationOutputPort sendIdForValidationOutputPort
    ) {
        this.findPlanetByIdOutputPort = findPlanetByIdOutputPort;
        this.insertPeopleOutputPort = insertPeopleOutputPort;
        this.sendIdForValidationOutputPort = sendIdForValidationOutputPort;
    }

    @Override
    public void insert(People people, Integer peopleId, Integer planetId) {
        var planet = findPlanetByIdOutputPort.find(planetId);
        people.setPlanet(planet);
        insertPeopleOutputPort.insert(people);
        sendIdForValidationOutputPort.send(peopleId, planetId);
    }

}

