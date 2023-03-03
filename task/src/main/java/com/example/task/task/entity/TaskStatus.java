package com.example.task.task.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaskStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TaskStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public TaskStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TaskStatus [id=" + id + ", status=" + status + "]";
	}
	
	
}
