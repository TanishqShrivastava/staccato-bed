 package com.staccato.cart.services;
 import java.util.HashMap;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.staccato.cart.dao.CartRepository;
import com.staccato.cart.dao.LineItemRepository;
import com.staccato.cart.domain.Cart;
import com.staccato.cart.domain.LineItem;
import com.staccato.cart.exceptions.BadDataException;
import com.staccato.cart.exceptions.CartNotFoundException;

 @Service
 @Transactional
 public class LineItemServiceImpl implements LineItemService { 

    @Autowired 
   
        LineItemRepository lineItemRepo; 
   
    @Autowired 
    CartRepository cartRepo; 
   
     //GET LINE ITEM BY ID 
    @Override 
    public ResponseEntity<?> getLineItemById(int id) { 
    Optional<LineItem> findById = lineItemRepo.findById(id); 

    if (!findById.isPresent()) { 

    throw new CartNotFoundException( 



    "There is no line item with this line item id please check your line item id!"); 

    } 
    return new ResponseEntity<>(findById, HttpStatus.OK); 
    } 
//    // CREATE LINE ITEM 
//    @Override 
//    public ResponseEntity<?> createLineItem(int cartId, LineItem lineItem) { 
//
//    Cart cart = cartRepo.findById(cartId).get(); 
//
//    lineItem.setCart(cart); 
//   
//    int addedQuantity = lineItem.getQuantity(); 
//   
//    if (addedQuantity <= 0) { 
//
//   
//    throw new BadDataException("Quantity cannot be less than 1"); 
//    } 
//    LineItem item = lineItemRepo.findByCartAndProductId(lineItem.getCart(), lineItem.getProductId()); 
//    if (item != null) { 
//
//    addedQuantity = item.getQuantity() + lineItem.getQuantity(); 
//
//    item.setQuantity(addedQuantity); 
//
//    } else { 
//
//    item = lineItem; 
//
//    } 
//    return new ResponseEntity<>(lineItemRepo.save(item), HttpStatus.CREATED); 
//    } 
//     //UPDATE LINE ITEM BY PRODUCT ID AND CART ID 
//    @Override 
//    public ResponseEntity<?> updateLineItem(int quantity, int productId, int cartId) { 
//    Optional<Cart> findById = cartRepo.findById(cartId); 
//
//    if (!findById.isPresent()) { 
//
//    throw new CartNotFoundException("Cart with this id doesn't exists"); 
//
//        } 
//        if (quantity <= 0) { 
//       
//    throw new BadDataException("Quantity cannot be less than 1"); 
//    } 
//    lineItemRepo.updateQuantity(quantity, productId, cartId); 
//    return new ResponseEntity<>("Line Item updated", HttpStatus.OK); 
//       
//        } 
//         //DELETE LINE ITEM BY PRODUCT ID AND CART ID 
//        @Override 
//        public ResponseEntity<?> deleteLineItem(int productId, int cartId) { 
//       
//        Optional<Cart> findById = cartRepo.findById(cartId); 
//       
//        if (!findById.isPresent()) { 
//       
//    throw new CartNotFoundException("Cart with this id doesn't exists"); 
//       
//        } 
//    lineItemRepo.deleteByCartAndProductId(productId, cartId); 
//    return new ResponseEntity<>(new HashMap<String, String>().put("success","Line Item Deleted"), HttpStatus.OK); 
//        }
}
       
   