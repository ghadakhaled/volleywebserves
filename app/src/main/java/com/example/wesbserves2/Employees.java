package com.example.wesbserves2;

import com.google.gson.annotations.SerializedName;

public class Employees{

	@SerializedName("firstname")
	private String firstname;

	@SerializedName("mail")
	private String mail;

	@SerializedName("age")
	private int age;

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setMail(String mail){
		this.mail = mail;
	}

	public String getMail(){
		return mail;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return 
			"Employees{" + 
			"firstname = '" + firstname + '\'' + 
			",mail = '" + mail + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}