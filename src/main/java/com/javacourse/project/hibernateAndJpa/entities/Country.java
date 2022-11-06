package com.javacourse.project.hibernateAndJpa.entities;


import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	@Column(name="country_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int country_id;
	
	@Column(name="country")
	private String country;
	
	@Column(name="population")
	private int population;	

	private Country(int country_id, String country, int population) {
		this.country_id = country_id;
		this.country = country;
		this.population = population;
	}
	
	private Country() {
		
	}


	public int getCountry_id() {
		return country_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
