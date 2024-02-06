package dev.practice.medicineinventory.repositories;

import java.util.List;

import dev.practice.medicineinventory.domain.Medicine;

public interface InventoryRepository {
	List<Medicine> findAll();
	Medicine add(Medicine m);
	boolean remove(Medicine m);
	Medicine findById(String id);
	boolean removeById(String id);
}
