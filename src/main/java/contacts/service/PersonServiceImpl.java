package contacts.service;

import contacts.dao.PersonRepository;
import contacts.model.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    PersonRepository personRepository;
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
