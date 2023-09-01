package com.ideas.springboot.web.app.service.dto.team;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "datosclima")
public class Datosclima {


	public Datosclima(Long id, String name, String region, String country, double temp_C, double temp_f) {
		super();
		this.id = id;
		this.name = name;
		this.region = region;
		this.country = country;
		Temp_C = temp_C;
		Temp_f = temp_f;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;

	private String name;
    private String region;
    private String country;
    private double Temp_C;
	private double Temp_f;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public double getTemp_C() {
			return Temp_C;
		}
	public void setTemp_C(double Temp_C) {
			this.Temp_C = Temp_C;
		}
	public double getTemp_f() {
		return Temp_f;
	}
	public void setTemp_f(double Temp_f) {
		this.Temp_f = Temp_f;
	}
}
