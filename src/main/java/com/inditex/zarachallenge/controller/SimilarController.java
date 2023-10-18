package com.inditex.zarachallenge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class SimilarController {


	@GetMapping("/product/{id}/similar")
	public ResponseEntity<String> getProductSimilarid(@PathVariable Integer id) {
		System.out.println("id:" + id);
		return null;
	}
}
