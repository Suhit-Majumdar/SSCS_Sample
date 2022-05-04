package com.wipro.ospo.sscs.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sbom")
public class Sbom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String repository_id;
	private String project_name;
	private String project_path;
	private String format;
	private String sbom_generator_tool;
	private String image_registry;
	private String image_name;
	private String image_tag;
	private Date created_on;
	private String created_by;
	private Date modified_on;

	public Sbom(Long id, String repository_id, String project_name, String project_path, String format,
			String sbom_generator_tool, String image_registry, String image_name, String image_tag, Date created_on,
			String created_by, Date modified_on) {
		super();
		this.id = id;
		this.repository_id = repository_id;
		this.project_name = project_name;
		this.project_path = project_path;
		this.format = format;
		this.sbom_generator_tool = sbom_generator_tool;
		this.image_registry = image_registry;
		this.image_name = image_name;
		this.image_tag = image_tag;
		this.created_on = created_on;
		this.created_by = created_by;
		this.modified_on = modified_on;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRepository_id() {
		return repository_id;
	}

	public void setRepository_id(String repository_id) {
		this.repository_id = repository_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_path() {
		return project_path;
	}

	public void setProject_path(String project_path) {
		this.project_path = project_path;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getSbom_generator_tool() {
		return sbom_generator_tool;
	}

	public void setSbom_generator_tool(String sbom_generator_tool) {
		this.sbom_generator_tool = sbom_generator_tool;
	}

	public String getImage_registry() {
		return image_registry;
	}

	public void setImage_registry(String image_registry) {
		this.image_registry = image_registry;
	}

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}

	public String getImage_tag() {
		return image_tag;
	}

	public void setImage_tag(String image_tag) {
		this.image_tag = image_tag;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getModified_on() {
		return modified_on;
	}

	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}

	public Sbom() {
	}

}