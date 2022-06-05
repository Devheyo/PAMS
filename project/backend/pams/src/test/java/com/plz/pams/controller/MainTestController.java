package com.plz.pams.controller;

import com.plz.pams.service.MainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc //need this in Spring Boot test
public class MainTestController {
/*
    @Autowired
    private MockMvc mvc;

    @MockBean
    private MainService mainService;

    @Test
    public void selectAll() throws Exception{
        System.out.println("@@@@ TEST @@@@");

        mvc.perform(get("/all"))
                .andExpect(status().isOk());
    }

 */
}