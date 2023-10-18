package com.inditex.zarachallenge.infrastructure.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class CustomSimilarProduct implements Serializable {

  private int id;
  private String name;
  private BigDecimal price;
  private boolean availability;
}