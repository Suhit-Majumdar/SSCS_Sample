package com.wipro.ospo.sscs.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wipro.ospo.sscs.service.SbomService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProjectsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private SbomService sbomService = new SbomService();

	@Test
	void testGetProjects() {
		String dow = sbomService.findAll().get(0).getRepository_id();
		assertEquals("2", dow);
		dow = sbomService.findAll().get(0).getProject_path();
		assertEquals("www.github.com/ak20102763/dev", dow);
		dow = sbomService.findAll().get(0).getProject_name();
		assertEquals("dev", dow);
		dow = sbomService.findAll().get(0).getFormat();
		assertEquals("spdx", dow);
		dow = sbomService.findAll().get(0).getSbom_generator_tool();
		assertEquals("fossology", dow);
		dow = sbomService.findAll().get(0).getImage_registry();
		assertEquals("docker registry", dow);
		dow = sbomService.findAll().get(0).getImage_name();
		assertEquals("dev-image", dow);
		dow = sbomService.findAll().get(0).getImage_tag();
		assertEquals("dev-image-sbom", dow);
		dow = sbomService.findAll().get(0).getCreated_by();
		assertEquals("akash", dow);

	}
}
