package br.com.pereira.starwars.adapters.out.client.planet.mapper;

import br.com.pereira.starwars.adapters.out.client.planet.response.PeopleResponse;
import br.com.pereira.starwars.application.core.domain.people.People;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeopleResponseMapper {

    People toPeople(PeopleResponse peopleResponse);

}
