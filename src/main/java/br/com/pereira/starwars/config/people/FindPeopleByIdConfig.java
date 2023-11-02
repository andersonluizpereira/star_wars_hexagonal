package br.com.pereira.starwars.config.people;

import br.com.pereira.starwars.adapters.out.people.FindPeopleByIdAdapter;
import br.com.pereira.starwars.application.core.usecase.people.FindPeopleByIdByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindPeopleByIdConfig {

    @Bean
    public FindPeopleByIdByIdUseCase insertPeopleUseCase(
            FindPeopleByIdAdapter findPeopleByIdCodeAdapter
    ) {
        return new FindPeopleByIdByIdUseCase(findPeopleByIdCodeAdapter);
    }

}
