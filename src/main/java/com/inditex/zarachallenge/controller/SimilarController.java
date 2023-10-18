package com.inditex.zarachallenge.controller;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.zarachallenge.infrastructure.model.CustomSimilarProduct;
import com.inditex.zarachallenge.infrastructure.repository.SimilarProductRepository;

@RestController
@RequestMapping("/product")
public class SimilarController {

  private final SimilarProductRepository similarProductRepository;

  public SimilarController(final SimilarProductRepository similarProductRepository) {
    this.similarProductRepository = similarProductRepository;
  }

  @Value("${date}")
  private Instant date;

  @GetMapping("/{productId}/similar")
  public ResponseEntity<List<CustomSimilarProduct>> getProductSimilarid(@PathVariable Integer productId) {

    List<CustomSimilarProduct> similarProductList = this.similarProductRepository
        .findByProductIdWithOfferDate(productId, date);

    return ResponseEntity.ok(similarProductList);
  }
}
