package com.needin.request;

import java.util.HashSet;
import java.util.Set;

import com.needin.model.Time;




public class CreateProductRequest {
	
    private String title;

    private String description;

    private int price;

    private int discountedPrice;
   
    private int discountPersent;

   // private int quantity;

    private String servicetype;

   // private String color;

    private Set<Time> time=new HashSet<>();

    private String imageUrl;

    private String topLavelCategory;
    private String secondLavelCategory;
    private String thirdLavelCategory;

	public Set<Time> getTime() {
		return time;
	}
	public void setTime(Set<Time> time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public int getDiscountPersent() {
		return discountPersent;
	}

	public void setDiscountPersent(int discountPersent) {
		this.discountPersent = discountPersent;
	}

//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}

	public String getServicetype() {
		return servicetype;
	}

	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}

//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTopLavelCategory() {
		return topLavelCategory;
	}

	public void setTopLavelCategory(String topLavelCategory) {
		this.topLavelCategory = topLavelCategory;
	}

	public String getSecondLavelCategory() {
		return secondLavelCategory;
	}

	public void setSecondLavelCategory(String secondLavelCategory) {
		this.secondLavelCategory = secondLavelCategory;
	}

	public String getThirdLavelCategory() {
		return thirdLavelCategory;
	}

	public void setThirdLavelCategory(String thirdLavelCategory) {
		this.thirdLavelCategory = thirdLavelCategory;
	}

	
    
    
}
