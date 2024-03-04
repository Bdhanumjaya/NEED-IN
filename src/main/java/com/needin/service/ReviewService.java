package com.needin.service;

import java.util.List;

import com.needin.exception.ProductException;
import com.needin.model.Review;
import com.needin.model.User;
import com.needin.request.ReviewRequest;



public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
