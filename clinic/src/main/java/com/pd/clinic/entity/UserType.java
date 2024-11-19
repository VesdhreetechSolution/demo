package com.pd.clinic.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user_type")
public class UserType {

	@Id
	@Column(name="id")
	private String id = UUID.randomUUID().toString();

	@Column(name = "name")
	private String name;

	@Column(name = "is_del")
	private String isDel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return "UserType [id=" + id + ", name=" + name + ", isDel=" + isDel + "]";
	}

	
	
}
