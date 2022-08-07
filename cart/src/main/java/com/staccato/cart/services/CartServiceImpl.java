 package com.staccato.cart.services;
 import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.staccato.cart.dao.CartRepository;
import com.staccato.cart.domain.Cart;
import com.staccato.cart.domain.LineItem;
import com.staccato.cart.exceptions.CartNotFoundException;
 @Service
 public class CartServiceImpl implements CartService { 
 	
	 @Autowired CartRepository cartRepo;    
 	
	 @Autowired LineItemService lineItemService;  
	
 	 //GET CART BY ID  
 	@Override  
 	public ResponseEntity<?> getCartById(int id)  
 	{   
 		Optional<Cart> cartById = cartRepo.findById(id);    
 		if (!cartById.isPresent())  
 			{     
 				throw new CartNotFoundException("There is no cart with this cart id please check your cart id!");    
 			}   
 		return new ResponseEntity<>(cartById, HttpStatus.OK);  
 	}  
	
//	
// 	 //CREATE CART @Override  
// 	public ResponseEntity<?> createCart(Cart cart)  
// 	{    
// 		cart.setLineItems(new ArrayList<>());    
// 		ResponseEntity<?> response = new ResponseEntity<>(
// 			cartRepo.save(cart), HttpStatus.CREATED);   
// 		return response;  
//		
// 	}  
//
// 	 //UPDATE CART BY ID  
// 	@Override  
//	
// 	public ResponseEntity<?> updateCart(int id, Cart cart)  
// 	{    
// 		 		return new ResponseEntity<>(cart, HttpStatus.OK);  
// 	}     
// //DELETE CART BY ID  
// 	
// 	@Override  
// 	public ResponseEntity<?> deleteCart(int id)  
// 	{    
// 		Optional<Cart> findById = cartRepo.findById(id);    
// 		if (!findById.isPresent())
// 		{
// 			throw new CartNotFoundException("There is no cart with this cart id please check your cart id!");    
// 		}    
// 		cartRepo.deleteById(id);    
// 		return new ResponseEntity<>("Cart is emptied", HttpStatus.OK); 
// 	}
 }

