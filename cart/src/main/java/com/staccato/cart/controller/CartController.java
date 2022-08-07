package com.staccato.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staccato.cart.domain.Cart;
import com.staccato.cart.services.CartService;

@RestController
@RequestMapping("/api")
public class CartController {

 @Autowired
 CartService cartService;

 // SEARCH CART
 @GetMapping("/cart/{id}")
 public ResponseEntity<?> searchCart(@PathVariable("id") int id) {
   ResponseEntity<?> response = cartService.getCartById(id);
   return response;
 }
//
// // CREATE CART
// @PostMapping("/cart")
// public ResponseEntity<?> addCart(@RequestBody Cart cart) {
//   ResponseEntity<?> response = cartService.createCart(cart);
//   return response;
// }
//
// // UPDATE CART
// @PutMapping("/cart/{id}")
// public ResponseEntity<?> updateCart(@PathVariable("id") int id, @RequestBody Cart cart) {
//   ResponseEntity<?> response = cartService.updateCart(id, cart);
//   return response;
// }
//
// // DELETE CART
// @DeleteMapping("/cart/{id}")
// public ResponseEntity<?> emptyCart(@PathVariable("id") int id) {
//   ResponseEntity<?> response = cartService.deleteCart(id);
//   return response;
// }
//
// /*
//   
// */
}


