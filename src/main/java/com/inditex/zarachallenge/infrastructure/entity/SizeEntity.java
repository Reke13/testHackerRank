package com.inditex.zarachallenge.infrastructure.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SizeEntity {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="SIZE_ID")
  private int sizeId;
  @Column(name="SIZE")
  private String SIZE;
  @Column(name="AVAILABILITY")
  private boolean AVAILABILITY;
  @Column(name="LAST_UPDATED")
  private Timestamp LAST_UPDATED;
  @Column(name="PRODUCT_ID")
  private int PRODUCT_ID;
}