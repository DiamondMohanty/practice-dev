package dev.practice.medicineinventory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.practice.medicineinventory.domain.Medicine;
import dev.practice.medicineinventory.services.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	private InventoryService inventoryService;
	
	@Autowired
	public InventoryController(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	@GetMapping
	public List<Medicine> getInventoryItems() {
		return inventoryService.getItemsInStore();
	}
	
	@PostMapping
	public Medicine addItemToInventory(@RequestBody Medicine m) {
		return inventoryService.addItemToStore(m);
	}
	
	@DeleteMapping
	public boolean removeItemFromInventory(@RequestBody Medicine m) {
		return inventoryService.removeMedicine(m);
	}
	
	@DeleteMapping(path = "/{id}")
	public boolean removeItemFromInventoryById(@PathVariable String id) {
		return inventoryService.removeById(id);
	}
	
	@GetMapping(path = "/{id}")
	public Medicine findItem(@PathVariable String id) {
		return inventoryService.findById(id);
	}
	
}
