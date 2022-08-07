 package com.staccato.cart.services;

 import org.springframework.http.ResponseEntity;

 import com.staccato.cart.domain.Cart;



 public interface CartService {

    ResponseEntity<?> getCartById(int id);

//    ResponseEntity<?> createCart(Cart cart);
//
//    ResponseEntity<?> updateCart(int id, Cart cart);
//
//    ResponseEntity<?> deleteCart(int id);

 }
