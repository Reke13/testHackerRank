package com.inditex.zarachallenge.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.zarachallenge.infrastructure.model.CustomSimilarProduct;
import com.inditex.zarachallenge.spi.SimilarProductService;

@RestController
@RequestMapping("/product")
public class SimilarController {

  private final SimilarProductService similarProductService;

  public SimilarController(final SimilarProductService similarProductService) {
    this.similarProductService = similarProductService;
  }

  @GetMapping("/{productId}/similar")
  public ResponseEntity<List<CustomSimilarProduct>> getProductSimilarid(@PathVariable Integer productId) {

    List<CustomSimilarProduct> similarProductList = this.similarProductService.findSimilarProducts(productId);

    return ResponseEntity.ok(similarProductList);
  }
}
