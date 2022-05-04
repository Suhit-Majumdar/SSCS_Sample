package com.wipro.ospo.sscs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ospo.sscs.model.Sbom;

@Repository
public interface SbomRepository extends CrudRepository<Sbom, Long> {

}