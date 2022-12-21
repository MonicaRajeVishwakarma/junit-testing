package com.tech.basics.junittesting.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
public class PersonControllerTest {

    private MockMvc mockMvc; //Unit Test

    @InjectMocks
    PersonController personController;

    @Before
    public void setUp() throws Exception {
            mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
    }

    @Test
    public void testPersonController() throws  Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("HelloWorld"));
    }

    @Test
    public void testPersonControllerJSON() throws  Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/json").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("Monica")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.age",Matchers.is(31)));
    }
}