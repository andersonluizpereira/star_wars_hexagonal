package br.com.pereira.starwars.adapters.in.controller;

import br.com.pereira.starwars.adapters.in.controller.mapper.PeopleMapper;
import br.com.pereira.starwars.adapters.in.controller.response.PeopleResponse;
import br.com.pereira.starwars.application.ports.in.people.FindPeopleByIdInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/peoples")
public class PeopleController {
    @Autowired
    private FindPeopleByIdInputPort findPeopleByIdInputPort;

    @Autowired
    private PeopleMapper peopleMapper;

    @GetMapping("/{id}")
    public ResponseEntity<PeopleResponse> findById(@PathVariable final Integer id) {
        var customer = findPeopleByIdInputPort.find(id);
        var customerResponse = peopleMapper.toPeopleResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

}
