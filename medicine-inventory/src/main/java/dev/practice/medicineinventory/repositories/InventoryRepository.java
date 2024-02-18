package dev.practice.medicineinventory.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import dev.practice.medicineinventory.domain.Medicine;

public interface InventoryRepository extends JpaRepository<Medicine, Long> {
	
}
