package com.inditex.zarachallenge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inditex.zarachallenge.infrastructure.entity.ProductEntity;
import com.inditex.zarachallenge.infrastructure.repository.ProductRepository;

@Controller
@RequestMapping("/product")
public class SimilarController {

	private final ProductRepository productRepository;
	public SimilarController(final ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@GetMapping("/{productId}")
	public ResponseEntity<ProductEntity> getProduct(@PathVariable Integer productId) {
		return ResponseEntity.ok(this.productRepository.findById(productId).orElse(null));
	}

	@GetMapping("/{productId}/similar")
	public ResponseEntity<Integer> getProductSimilarid(@PathVariable Integer productId) {
		System.out.println("productId:" + productId);
		return ResponseEntity.ok(productId);
	}
}
