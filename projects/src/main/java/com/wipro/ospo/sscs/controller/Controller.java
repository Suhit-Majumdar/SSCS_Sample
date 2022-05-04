package com.wipro.ospo.sscs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ospo.sscs.model.Sbom;
import com.wipro.ospo.sscs.service.SbomService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "SBOM", description = "SBOM projects and management end points")
public class Controller {

	@Autowired
	private SbomService sbomService;

	@GetMapping("/getProjects")
	public List<Sbom> findProjects() {

		List<Sbom> projects = (List<Sbom>) sbomService.findAll();

		return projects;
	}

	@GetMapping("/getProjectCount")
	public List<String> findProjectCount() {

		List<String> projectCount = new ArrayList<String>();

		projectCount.add(sbomService.findProjectCount());

		return projectCount;
	}
}