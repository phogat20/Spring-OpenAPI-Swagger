package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fuel_details")
public class Fuel {
	@Id
	@Column(name = "ref_id")
	private Integer refId;
	
	@Column(name = "first_name",length =10)
	@NotNull(message = "Please enter first name!")
	private String firstName;
	
	@Column(name = "last_name",length =10)
	@NotNull(message = "Please enter first name!")
	private String lastName;
	
	@Column(name = "mobile_number",length =10)
	@Pattern(regexp = "^\\d{10}$", message = "Invaild Mobile Number!")
	private String mobileNumber;
	
	@Column(name = "fuel_type")
	@NotNull(message = "Please choose fuel type!")
	private String fuelType;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "fuel_quantity")
	private String quantity;
	
}
