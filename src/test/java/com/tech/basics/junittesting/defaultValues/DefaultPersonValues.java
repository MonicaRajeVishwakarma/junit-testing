package com.tech.basics.junittesting.defaultValues;

import com.tech.basics.junittesting.model.Person;

public class DefaultPersonValues {

    Person person;

    public String setDefaultPersonDetails(){
        return  new Person("Monica",32).toString();
    }
}
