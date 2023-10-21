package com.inditex.zarachallenge.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@WebAppConfiguration
class SimilarControllerTest {
  @Autowired
  private WebApplicationContext webApplicationContext;
  private MockMvc mockMvc;
  private static String URL = "/product/{id}/similar";

  @BeforeEach
  public void setup() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
  }

  @Test
  void testInput9() throws Exception {
    mockMvc.perform(get(URL, 9)).andExpect(status().is(HttpStatus.OK.value()))
        .andExpect(jsonPath("$.[0].id").value("11")).andExpect(jsonPath("$.[0].name").value("Cotton T-shirt"))
        .andExpect(jsonPath("$.[0].price").value(39.99)).andExpect(jsonPath("$.[0].availability").value(false))
        .andExpect(jsonPath("$.[1].id").value("15")).andExpect(jsonPath("$.[1].name").value("Button-up shirt"))
        .andExpect(jsonPath("$.[1].price").value(49.99)).andExpect(jsonPath("$.[1].availability").value(true))
        .andExpect(jsonPath("$.[2].id").value("19")).andExpect(jsonPath("$.[2].name").value("Linen pants"))
        .andExpect(jsonPath("$.[2].price").value(29.99)).andExpect(jsonPath("$.[2].availability").value(true))
        .andReturn().getResponse().getContentAsString();
  }

  @Test
  void testInput12() throws Exception {
    System.out.println(mockMvc.perform(get(URL, 12)).andReturn().getResponse().getContentAsString());
    mockMvc.perform(get(URL, 12)).andExpect(status().is(HttpStatus.OK.value()))
        .andExpect(jsonPath("$.[0].id").value("20")).andExpect(jsonPath("$.[0].name").value("Polo shirt"))
        .andExpect(jsonPath("$.[0].price").value(24.99)).andExpect(jsonPath("$.[0].availability").value(false))
        .andExpect(jsonPath("$.[1].id").value("18")).andExpect(jsonPath("$.[1].name").value("Chinos"))
        .andExpect(jsonPath("$.[1].price").value(59.99)).andExpect(jsonPath("$.[1].availability").value(true))
        .andExpect(jsonPath("$.[2].id").value("19")).andExpect(jsonPath("$.[2].name").value("Linen pants"))
        .andExpect(jsonPath("$.[2].price").value(29.99)).andExpect(jsonPath("$.[2].availability").value(true))
        .andReturn().getResponse().getContentAsString();
  }

  @Test
  void testControllerAdvice() throws Exception {
    mockMvc.perform(get(URL, 4529)).andExpect(status().is(HttpStatus.NOT_FOUND.value()))
        .andExpect(jsonPath("$.code").value("ERR00001"));
  }

}