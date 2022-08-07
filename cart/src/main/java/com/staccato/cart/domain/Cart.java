 package com.staccato.cart.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
 public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    @OneToMany(mappedBy = "cart", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<LineItem> lineItems;
    
    
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public List<LineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", lineItems=" + lineItems + "]";
	}
	public Cart(int cartId, List<LineItem> lineItems) {
		super();
		this.cartId = cartId;
		this.lineItems = lineItems;
	}
    
    
 }
