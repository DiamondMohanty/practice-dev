package dev.practice.medicineinventory.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import dev.practice.medicineinventory.domain.Medicine;

@Repository
public class InventoryRepositoryImpl implements InventoryRepository {

	private List<Medicine> medicines;
	
	public InventoryRepositoryImpl() {
		this.medicines = new ArrayList<Medicine>();
	}
	
	@Override
	public List<Medicine> findAll() {
		return this.medicines;
	}

	@Override
	public Medicine add(Medicine m) {
		this.medicines.add(m);
		return m;
	}

	@Override
	public boolean remove(Medicine m) {
		var foundMedicine = this.findMedicineById(m.getId());
		if (foundMedicine == null) {
			return false;
		}
		return medicines.remove(foundMedicine);
	}

	@Override
	public Medicine findById(String id) {
		return this.findMedicineById(id);
	}

	@Override
	public boolean removeById(String id) {
		var foundMedicine = this.findMedicineById(id);
		if (foundMedicine == null) {
			return false;
		}
		return medicines.remove(foundMedicine);	
	}
	
	private Medicine findMedicineById(String id) {
		var filteredMedicine = this.medicines.stream().filter(m -> {
			return m.getId().equals(id);
		}).collect(Collectors.toList());
		if (filteredMedicine.size() == 1) {
			return filteredMedicine.get(0);
		} else {
			return null;
		}
	}
}
