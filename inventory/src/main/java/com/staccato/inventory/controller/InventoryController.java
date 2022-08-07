package com.staccato.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	
	@GetMapping("/show")
	public String show() {
		return "runnnnnnnnnnig";
	}
}
