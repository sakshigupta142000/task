package com.example.task.task.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int projectId;
	
	private String title;
	
	private String description;
	
    private LocalDate startDate;
	
	private LocalDate dueDate;
	
	private int statusId;
	
	private int assignedToId;
	
	private int createdBy;
	
	private LocalDate createdOn;
	
	private int taskCategoryId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getAssignedToId() {
		return assignedToId;
	}

	public void setAssignedToId(int assignedToId) {
		this.assignedToId = assignedToId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public int getTaskCategoryId() {
		return taskCategoryId;
	}

	public void setTaskCategoryId(int taskCategoryId) {
		this.taskCategoryId = taskCategoryId;
	}

	public task(int id, int projectId, String title, String description, LocalDate startDate, LocalDate dueDate,
			int statusId, int assignedToId, int createdBy, LocalDate createdOn, int taskCategoryId) {
		super();
		this.id = id;
		this.projectId = projectId;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.statusId = statusId;
		this.assignedToId = assignedToId;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.taskCategoryId = taskCategoryId;
	}

	public task() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "task [id=" + id + ", projectId=" + projectId + ", title=" + title + ", description=" + description
				+ ", startDate=" + startDate + ", dueDate=" + dueDate + ", statusId=" + statusId + ", assignedToId="
				+ assignedToId + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", taskCategoryId="
				+ taskCategoryId + "]";
	}
	
	
	
	
	
	
	
}
