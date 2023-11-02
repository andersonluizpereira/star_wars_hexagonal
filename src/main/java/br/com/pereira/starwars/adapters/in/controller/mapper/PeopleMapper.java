package br.com.pereira.starwars.adapters.in.controller.mapper;

import br.com.pereira.starwars.adapters.in.controller.response.PeopleResponse;
import br.com.pereira.starwars.application.core.domain.people.People;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeopleMapper {
    PeopleResponse toPeopleResponse(People people);
}
