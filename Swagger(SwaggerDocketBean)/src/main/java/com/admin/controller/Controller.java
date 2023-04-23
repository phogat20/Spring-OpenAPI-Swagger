package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.Fuel;
import com.admin.service.FuelService;

@RestController
public class Controller {

	@Autowired
	private FuelService fuelService;

	@PostMapping("/addFuelDetails")
	public Fuel addCFuelDetails(@RequestBody Fuel f) {
		return fuelService.addFuelBill(f);
	}

	@GetMapping("/allfuels/{id}")
	public Fuel getFuels(@PathVariable Integer id) {
		return fuelService.getFuelDetails(id);
	}

	@GetMapping("/getAllDetails")
	public List<Fuel> getCAllDetails() {
		return fuelService.getAllBills();
	}

	@DeleteMapping("/deleteRecord/{id}")
	public String deleteBill(@PathVariable Integer id) {
		fuelService.deleteExistingBill(id);
		return "Record Deleted!!";
	}
	
	@PutMapping("/updateRecord/{id}")
	public Fuel updateRecird(@PathVariable Integer id, Fuel f) {
		return fuelService.updateFuelBillDetails(id, f);
	}
	
}
