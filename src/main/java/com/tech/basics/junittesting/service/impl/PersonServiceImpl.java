package com.tech.basics.junittesting.service.impl;

import lombok.extern.slf4j.Slf4j;
import com.tech.basics.junittesting.model.Person;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonServiceImpl implements  PersonService{

    Person person;
    @Override
    public String getPersonDetails() {
        person = new Person("Monica",32);
        return person.toString();
    }
}
