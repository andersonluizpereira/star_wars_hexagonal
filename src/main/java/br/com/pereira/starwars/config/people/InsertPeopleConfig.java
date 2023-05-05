package br.com.pereira.starwars.config.people;

import br.com.pereira.starwars.adapters.out.id.SendIdForValidationAdapter;
import br.com.pereira.starwars.adapters.out.people.InsertPeopleAdapter;
import br.com.pereira.starwars.adapters.out.planet.FindPlanetByIdCodeAdapter;
import br.com.pereira.starwars.application.core.usecase.people.InsertPeopleUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertPeopleConfig {

    @Bean
    public InsertPeopleUseCase insertPeopleUseCase(
            FindPlanetByIdCodeAdapter findPlanetByIdCodeAdapter,
            InsertPeopleAdapter insertPeopleAdapter,
            SendIdForValidationAdapter sendIdForValidationAdapter
    ) {
        return new InsertPeopleUseCase(findPlanetByIdCodeAdapter, insertPeopleAdapter, sendIdForValidationAdapter);
    }

}
