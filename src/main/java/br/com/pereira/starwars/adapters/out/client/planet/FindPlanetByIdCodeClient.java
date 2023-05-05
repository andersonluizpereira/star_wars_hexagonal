package br.com.pereira.starwars.adapters.out.client.planet;

import br.com.pereira.starwars.adapters.out.client.planet.response.PlanetResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${pereira.client.address.url}"
)
public interface FindPlanetByIdCodeClient {

    @GetMapping("/planets/{id}")
    PlanetResponse find(@PathVariable("id") Integer id);

}
