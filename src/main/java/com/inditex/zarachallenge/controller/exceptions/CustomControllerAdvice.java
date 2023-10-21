package com.inditex.zarachallenge.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inditex.zarachallenge.domain.exceptions.NotSimilarProductsFoundException;

@ControllerAdvice
public class CustomControllerAdvice {

  @ExceptionHandler(value = { NotSimilarProductsFoundException.class })
  protected ResponseEntity<Object> handleSimilarProductNotFound(RuntimeException ex, WebRequest request)
      throws JsonProcessingException {
    return new ResponseEntity<>(getJsonError(), HttpStatus.NOT_FOUND);
  }

  private static String getJsonError() throws JsonProcessingException {
    ObjectMapper objectMapper = Jackson2ObjectMapperBuilder.json().build();
    return objectMapper
        .writeValueAsString(new BussinesErrorExceptionDTO(BussinesErrorCodes.SIMILAR_PRODUCT_NOT_FOUND_EXCEPTION));
  }
}