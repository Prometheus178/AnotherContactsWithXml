package contacts.service;
import contacts.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    Person createPerson(Person person);
    List<Person> getAllPersons();
}
