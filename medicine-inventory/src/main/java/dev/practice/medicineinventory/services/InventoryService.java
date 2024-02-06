package dev.practice.medicineinventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.practice.medicineinventory.domain.Medicine;
import dev.practice.medicineinventory.repositories.InventoryRepository;

@Service
public class InventoryService {

	private InventoryRepository inventoryRepository;
	
	@Autowired
	public InventoryService(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
	}

	public List<Medicine> getItemsInStore() {
		return inventoryRepository.findAll();
	}
	
	public Medicine addItemToStore(Medicine m) {
		return inventoryRepository.add(m);
	}
	
	public boolean removeMedicine(Medicine m) {
		return inventoryRepository.remove(m);
	}
	
	public Medicine findById(String id) {
		return inventoryRepository.findById(id);
	}
	
	public boolean removeById(String id) {
		return inventoryRepository.removeById(id);
	}
}
