package br.com.pereira.starwars.adapters.out.repository.mapper.people;

import br.com.pereira.starwars.adapters.out.repository.entity.people.PeopleEntity;
import br.com.pereira.starwars.application.core.domain.people.People;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PeopleEntityMapper {


    @Mapping(target = "planet", ignore = true)
    PeopleEntity toPeopleEntity(People people);

    @Mapping(target = "planet", ignore = true)
    People toPeople(PeopleEntity peopleEntity);

}
