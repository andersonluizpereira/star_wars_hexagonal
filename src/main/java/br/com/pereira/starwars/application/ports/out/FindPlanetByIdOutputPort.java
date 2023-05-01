package br.com.pereira.starwars.application.ports.out;

import br.com.pereira.starwars.application.core.domain.Planet;

public interface FindPlanetByIdOutputPort {

    Planet find(Integer id);

}
