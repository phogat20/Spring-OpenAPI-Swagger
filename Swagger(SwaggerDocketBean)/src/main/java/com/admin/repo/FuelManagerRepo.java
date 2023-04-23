package com.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.model.Fuel;

public interface FuelManagerRepo extends JpaRepository<Fuel, Integer> {

}
