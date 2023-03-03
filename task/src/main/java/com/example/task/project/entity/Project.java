package com.example.task.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Project {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String projectName;
	
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Project(int id, String projectName, boolean status) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.status = status;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", status=" + status + "]";
	}
	
	
	
}
