package com.shopping.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.api.entity.productEntity;
import com.shopping.api.repository.productRepository;

@Service
public class productService {
	
	@Autowired
	productRepository productRepository;
	
	public List<productEntity> getAllProduct(){
		List<productEntity> obj=new ArrayList<>();
		productRepository.findAll().forEach(obj::add);
		return obj;
	}
	
	public productEntity getProduct(int id){
		return null;
	}
	
	public void addProduct(productEntity pe){
		productRepository.save(pe);
	}
	
	public void updateProduct(int id, productEntity pe){
		productRepository.save(pe);
	}
	
	public void deleteProduct(int id){
		productRepository.deleteById(id);		
	}

}
