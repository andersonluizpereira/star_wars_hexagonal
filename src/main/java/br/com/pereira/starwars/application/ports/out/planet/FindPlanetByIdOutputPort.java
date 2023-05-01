package br.com.pereira.starwars.application.ports.out.planet;

import br.com.pereira.starwars.application.core.domain.planet.Planet;

public interface FindPlanetByIdOutputPort {

    Planet find(Integer id);

}
