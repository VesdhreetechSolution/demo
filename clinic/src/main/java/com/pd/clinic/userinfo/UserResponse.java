package com.pd.clinic.userinfo;

import lombok.Data;

@Data
public class UserResponse {

	private String id;

	private String username;

	private int userTypeId;

	private String tenentId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getTenentId() {
		return tenentId;
	}

	public void setTenentId(String tenentId) {
		this.tenentId = tenentId;
	}

	@Override
	public String toString() {
		return "UserResponse [id=" + id + ", username=" + username + ", userTypeId=" + userTypeId + ", tenentId="
				+ tenentId + "]";
	}

}
