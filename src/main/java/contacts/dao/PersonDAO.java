package contacts.dao;

import contacts.model.Person;

import java.util.List;

public interface PersonDAO {

    Person createPerson(Person person);
    List<Person> getAllPersons();

}
