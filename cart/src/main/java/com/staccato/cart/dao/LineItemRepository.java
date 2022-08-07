 package com.staccato.cart.dao;

 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.staccato.cart.domain.Cart;
import com.staccato.cart.domain.LineItem;

 @Repository
 public interface LineItemRepository extends JpaRepository<LineItem, Integer> {

  public LineItem findByCartAndProductId(Cart cart, int productId);

  @Query("UPDATE LineItem l set l.quantity = ?1 WHERE l.productId = ?2 AND l.cart.id = ?3")
  @Modifying
  public void updateQuantity(int quantity, int productId, int cartId);

  @Query("DELETE FROM LineItem l WHERE l.productId = ?1 AND l.cart.id = ?2")
  @Modifying
  public void deleteByCartAndProductId(int productId, int cartId);
 }


