package com.hunarmand.io.model;

import org.springframework.data.annotation.Id;

public class Comment {
	
	@Id
	private String id;
	private int userId;
	private String body;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}
