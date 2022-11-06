package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.entities.Country;

public interface ICountryDal {
	
	List<Country> getAll();
	
	void add(Country country);
	void update(Country country);
	void delete(Country country);
	Country getById(int id);
}
