package com.tech.basics.junittesting.impl;

import com.tech.basics.junittesting.service.impl.PersonServiceImpl;
import com.tech.basics.junittesting.defaultValues.DefaultPersonValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceImplTest {

    PersonServiceImpl personServiceImpl;

    DefaultPersonValues defaultPersonValues;

    @Test
    void getPersonDetails() {
        personServiceImpl = new PersonServiceImpl();
        defaultPersonValues = new DefaultPersonValues();
        String personServiceExcepted =  personServiceImpl.getPersonDetails();
        String personServiceAsTest = defaultPersonValues.setDefaultPersonDetails();
        assertEquals(personServiceExcepted,personServiceAsTest);
    }
}