package com.wipro.ospo.sscs.service;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ospo.sscs.model.Sbom;
import com.wipro.ospo.sscs.repository.SbomRepository;

@Service
public class SbomService implements Service {

	@Autowired
	private SbomRepository repository;

	public List<Sbom> findAll() {

		var cities = (List<Sbom>) repository.findAll();

		return cities;
	}

	public String findProjectCount() {

		long cities = repository.count();
		
		String projectCount = Long.toString(cities);

		return projectCount;
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}
}