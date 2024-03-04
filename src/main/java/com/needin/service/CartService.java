package com.needin.service;

import com.needin.exception.ProductException;
import com.needin.model.Cart;
import com.needin.model.User;
import com.needin.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
