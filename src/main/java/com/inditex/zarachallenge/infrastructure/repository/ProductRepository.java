package com.inditex.zarachallenge.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inditex.zarachallenge.infrastructure.entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer>{

}
