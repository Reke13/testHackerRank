package com.inditex.zarachallenge.infrastructure.entity;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;
import shaded_package.com.sun.istack.NotNull;

@Entity
@Table(name = "OFFER")
@Data
@Generated
public class OfferEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private int id;
  @Column(name = "VALID_FROM")
  private Instant validForm;
  @Column(name = "PRICE")
  private BigDecimal price;
  @NotNull
  @Column(name = "PRODUCT_ID")
  private int productId;
}