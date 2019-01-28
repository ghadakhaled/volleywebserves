package com.example.wesbserves2;

import com.google.gson.annotations.SerializedName;

public class UserItem {

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("job")
	private String job;

	@SerializedName("age")
	private int age;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setJob(String job){
		this.job = job;
	}

	public String getJob(){
		return job;
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
			"UserItem{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",job = '" + job + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}