package com.javacourse.project.hibernateAndJpa.entities;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@Column(name="city_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int city_id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="population") 
	private int population; 
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	public City(int city_id, String city, Country country, int population) {
		this.city_id = city_id;
		this.city = city;
		this.population = population;
		this.country = country;
	}
	
	public City() {
		
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	public int getCity_id() {
		return city_id;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


}
