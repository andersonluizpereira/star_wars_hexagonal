package br.com.pereira.starwars.adapters.out.client.planet.mapper;

import br.com.pereira.starwars.adapters.out.client.planet.response.PlanetResponse;
import br.com.pereira.starwars.application.core.domain.planet.Planet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlanetResponseMapper {

    Planet toPlanet(PlanetResponse planetResponse);

}
