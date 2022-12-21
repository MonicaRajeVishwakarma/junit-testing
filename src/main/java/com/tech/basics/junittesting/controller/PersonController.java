package com.tech.basics.junittesting.controller;

import com.tech.basics.junittesting.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tech.basics.junittesting.service.impl.PersonService;

@Slf4j
@RestController
@RequestMapping("/hello")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping()
    public String getPersonDetails(){
        log.info("Here I am");
        //return personService.getPersonDetails();
        return "HelloWorld";
    }

    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson(){
        Person person = new Person("Monica",32);
        return  person;
    }

}
