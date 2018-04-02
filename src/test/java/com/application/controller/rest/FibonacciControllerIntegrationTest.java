package com.application.controller.rest;

import com.application.LegacyApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


/**
 * INTEGRATION test for fibonacci controller
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FibonacciControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTwo() throws Exception {
        mockMvc.perform(
        get("/fibonacci/2")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.sequence[0]").value("0"))
        .andExpect(jsonPath("$.sequence[1]").value("1"));
    }
}
