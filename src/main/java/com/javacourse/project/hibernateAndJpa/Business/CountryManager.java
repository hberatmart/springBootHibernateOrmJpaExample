package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.ICountryDal;
import com.javacourse.project.hibernateAndJpa.entities.Country;

@Service
public class CountryManager implements ICountryService {

	private ICountryDal countryDal;
	
	@Autowired
	public CountryManager(ICountryDal countryDal) {
		this.countryDal = countryDal;
	}
	
	
	@Override
	@Transactional
	public List<Country> getAll() {

		return this.countryDal.getAll();
	}

	@Override
	@Transactional
	public void add(Country country) {
		this.countryDal.add(country);
		
	}

	@Override
	@Transactional
	public void update(Country country) {
		this.countryDal.update(country);
		
	}

	@Override
	@Transactional
	public void delete(Country country) {
		this.countryDal.delete(country);
		
	}

	@Override
	@Transactional
	public Country getById(int id) {
		return this.countryDal.getById(id);
	}

}
