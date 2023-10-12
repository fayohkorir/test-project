package net.javaguides.springboot.springbootcrudhibernateexample.service;

import net.javaguides.springboot.springbootcrudhibernateexample.model.Person;
import net.javaguides.springboot.springbootcrudhibernateexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }
}
