package com.inditex.zarachallenge.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductEntity {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="ID")
  private int ID;
  @Column(name="NAME")
  private String NAME;
}