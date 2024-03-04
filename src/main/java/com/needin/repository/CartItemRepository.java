package com.needin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.needin.model.Cart;
import com.needin.model.CartItem;
import com.needin.model.Product;



public interface CartItemRepository extends JpaRepository<CartItem, Long>{

	@Query("SELECT ci From CartItem ci Where ci.cart=:cart And ci.product=:product And ci.time=:time And ci.userId=:userId")
	public CartItem isCartItemExist(@Param("cart")Cart cart,@Param("product")Product product,@Param("time")String size, @Param("userId")Long userId);
	
}


