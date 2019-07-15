package com.shopping.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.api.entity.productEntity;
import com.shopping.api.service.productService;

@RestController
@RequestMapping(path = "/webapi") 
public class productController {
	
	@Autowired
	productService productService;
	
	@RequestMapping("/product/test")
	public String hi()
	{
		return "Its working";
	}
	
	@RequestMapping("/allproduct")
	public List<productEntity> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@RequestMapping("/product/{id}")
	public productEntity getProduct(@PathVariable int id){
		return productService.getProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/product")   
	public void addProduct(@RequestBody productEntity pe ) {
		productService.addProduct(pe);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/product/{id}")
	public void updateProduct(@PathVariable int id, @RequestBody productEntity pe ) {
		productService.updateProduct(id, pe);
	}	

	@RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
	public void deleteProduct(@PathVariable int id)  {
		productService.deleteProduct(id);
	}

}
