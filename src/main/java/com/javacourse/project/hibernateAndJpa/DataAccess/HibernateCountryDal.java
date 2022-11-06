package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.entities.Country;

@Repository
public class HibernateCountryDal implements ICountryDal {

	
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCountryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	
	@Override
	@Transactional
	public List<Country> getAll() {
		Session session =  entityManager.unwrap(Session.class);
		List<Country> countries = session.createQuery("from Country", Country.class).getResultList();
		return countries;
	}

	@Override
	public void add(Country country) {
		Session session =  entityManager.unwrap(Session.class);
		session.save(country);
		
	}

	@Override
	public void update(Country country) {
		Session session =  entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
		
	}

	@Override
	public void delete(Country country) {
		Session session =  entityManager.unwrap(Session.class);
		Country countryToDelete = session.get(Country.class, country.getCountry_id());
		session.delete(countryToDelete);
		
	}

	@Override
	public Country getById(int id) {
		Session session =  entityManager.unwrap(Session.class);
		Country country = session.get(Country.class, id);
		return country;
	}


}
