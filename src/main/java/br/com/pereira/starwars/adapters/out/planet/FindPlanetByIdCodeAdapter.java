package br.com.pereira.starwars.adapters.out.planet;

import br.com.pereira.starwars.adapters.out.client.planet.FindPlanetByIdCodeClient;
import br.com.pereira.starwars.adapters.out.client.planet.mapper.PlanetResponseMapper;
import br.com.pereira.starwars.application.core.domain.planet.Planet;
import br.com.pereira.starwars.application.ports.out.planet.FindPlanetByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindPlanetByIdCodeAdapter implements FindPlanetByIdOutputPort {

    @Autowired
    private FindPlanetByIdCodeClient findPlanetByZipCodeClient;

    @Autowired
    private PlanetResponseMapper planetResponseMapper;

    @Override
    public Planet find(Integer id) {
        var planetResponse = findPlanetByZipCodeClient.find(id);
        return planetResponseMapper.toPlanet(planetResponse);
    }

}