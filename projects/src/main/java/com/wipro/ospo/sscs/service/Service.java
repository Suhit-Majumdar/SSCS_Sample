package com.wipro.ospo.sscs.service;

import java.util.List;
import java.util.Optional;

import com.wipro.ospo.sscs.model.Sbom;

public interface Service {

    List<Sbom> findAll();
    
    Optional<Sbom> findSbom(Long id);
}