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
		return inventoryRepository.save(m);
	}
	
	public void removeMedicine(Medicine m) {
		inventoryRepository.delete(m);
	}
	
	public Medicine findById(Long id) {
		return inventoryRepository.findById(id).get();
	}
	
	public void removeById(Long id) {
		inventoryRepository.deleteById(id);
	}
}
