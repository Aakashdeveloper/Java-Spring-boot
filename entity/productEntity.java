package com.shopping.api.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class productEntity {
	
	private int id;
	private String name;
	private String description;
	private String imagePath;
	private String rating;
	
	
	public productEntity() {
		super();
	}

	public productEntity(int id, String name, String description, String imagePath, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.rating = rating;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	

}
