package com.admin.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.admin.model.Fuel;

@Component
public interface FuelService {

	Fuel addFuelBill(Fuel f);

	Fuel getFuelDetails(Integer id);

	List<Fuel> getAllBills();


	String deleteExistingBill(Integer id);

	Fuel updateFuelBillDetails(Integer id, Fuel f);

}
