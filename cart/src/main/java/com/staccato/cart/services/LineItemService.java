 package com.staccato.cart.services;

 import org.springframework.http.ResponseEntity;

import com.staccato.cart.domain.LineItem;



 public interface LineItemService {



    ResponseEntity<?> getLineItemById(int id);



//    ResponseEntity<?> createLineItem(int cartId, LineItem lineItem);
//
//
//
//    ResponseEntity<?> updateLineItem(int quantity, int productId, int cartId);
//
//
//
//    ResponseEntity<?> deleteLineItem(int productId, int cartId);

 }
