package htw.webtech.myapp.rest.controller;

import htw.webtech.myapp.business.service.PersonService;
import htw.webtech.myapp.rest.model.PersonDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public ResponseEntity<List<PersonDTO>> getPersons() {
        return ResponseEntity.ok(personService.getAllPersons());
    }
}
