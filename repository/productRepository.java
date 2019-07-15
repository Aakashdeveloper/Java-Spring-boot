package com.shopping.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.api.entity.productEntity;

public interface productRepository extends MongoRepository<productEntity, Integer> {

	//MongoRepository<productEntity, Integer>
	//CrudRepository<productEntity, Integer>
}
