package com.inditex.zarachallenge.infrastructure.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import shaded_package.com.sun.istack.NotNull;

@Entity
@Data
@Builder
public class OfferEntity {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="ID")
  private int id;
  @Column(name="VALID_FROM")
  private Timestamp validForm;
  @Column(name="PRICE")
  private Number price;
  @NotNull
  @Column(name="PRODUCT_ID")
  private int productId;
}