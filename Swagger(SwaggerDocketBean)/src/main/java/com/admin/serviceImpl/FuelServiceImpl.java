package com.admin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Fuel;
import com.admin.repo.FuelManagerRepo;
import com.admin.service.FuelService;

@Service
public class FuelServiceImpl implements FuelService{
	
	@Autowired
	private FuelManagerRepo fuelManagerRepo;
	
	@Override
	public Fuel addFuelBill(Fuel f) {
		return fuelManagerRepo.save(f);
	}

	@Override
	public Fuel getFuelDetails(Integer id) {
		return fuelManagerRepo.findById(id).get();
	}

	@Override
	public List<Fuel> getAllBills() {
		return fuelManagerRepo.findAll();
	}

	@Override
	public Fuel updateFuelBillDetails(Integer id,Fuel f) {
		return fuelManagerRepo.save(f);
	}

	@Override
	public String deleteExistingBill(Integer id) {
		fuelManagerRepo.deleteById(id);
		return "Details has been deleted!!";
	}

	

}
