package com.inditex.zarachallenge.infrastructure.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "SIZE")
@Data
@Generated
public class SizeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "SIZE_ID")
  private int sizeId;
  @Column(name = "SIZE")
  private String size;
  @Column(name = "AVAILABILITY")
  private boolean availability;
  @Column(name = "LAST_UPDATED")
  private Timestamp lastUpdated;
  @Column(name = "PRODUCT_ID")
  private int productId;
}