package com.myapp.myapp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class EntityApp
{
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
	private int id;
	
	
    public int getID() {
		return id;
	}
	public void setID(int iD) {
		this.id = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name="name")
	private String name;

	@Column(name="age")
    private int age;

	@Column(name="number")
    private String number;
}
