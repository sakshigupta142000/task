package com.example.task.comments.entity;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int taskId;
	private int userId;
	private String comment;
	private LocalDate CommentDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTaskId() {                                                              
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDate getCommentDate() {
		return CommentDate;
	}
	public void setCommentDate(LocalDate commentDate) {
		CommentDate = commentDate;
	}
	public Comment(int id, int taskId, int userId, String comment, LocalDate commentDate) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.userId = userId;
		this.comment = comment;
		CommentDate = commentDate;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Comments [id=" + id + ", taskId=" + taskId + ", userId=" + userId + ", comment=" + comment
				+ ", CommentDate=" + CommentDate + "]";
	}
	
	
}
