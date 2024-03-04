package com.needin.service;

import java.util.List;

import com.needin.exception.ProductException;
import com.needin.model.Rating;
import com.needin.model.User;
import com.needin.request.RatingRequest;


public interface RatingService {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
