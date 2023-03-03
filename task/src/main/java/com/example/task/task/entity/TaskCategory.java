package com.example.task.task.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaskCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public TaskCategory(int id, String category) {
		super();
		this.id = id;
		this.category = category;
	}
	public TaskCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TaskCategory [id=" + id + ", category=" + category + "]";
	}
	
	
}
