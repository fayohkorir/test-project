package net.javaguides.springboot.springbootcrudhibernateexample.controller;

import net.javaguides.springboot.springbootcrudhibernateexample.model.Person;
import net.javaguides.springboot.springbootcrudhibernateexample.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService){
        this.personService = personService;
    }
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public Person createPerson(@RequestBody Person request){
       return personService.createPerson(request);
    }
}
