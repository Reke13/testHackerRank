package com.inditex.zarachallenge.infrastructure.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

@Data
@AllArgsConstructor
@Generated
public class CustomSimilarProduct implements Serializable {

  private int id;
  private String name;
  private BigDecimal price;
  private boolean availability;
}