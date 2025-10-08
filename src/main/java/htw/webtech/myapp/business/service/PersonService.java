package htw.webtech.myapp.business.service;

import htw.webtech.myapp.rest.model.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public List<PersonDTO> getAllPersons() {
        return List.of(
                new PersonDTO("Pavel", "Nasaltsev"),
                new PersonDTO("Arif", "Wider")
        );
    }
}
