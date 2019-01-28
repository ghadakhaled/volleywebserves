package com.example.wesbserves2;

public class Floweritem{
	private String instructions;
	private int productId;
	private double price;
	private String name;
	private String photo;
	private String category;

	public void setInstructions(String instructions){
		this.instructions = instructions;
	}

	public String getInstructions(){
		return instructions;
	}

	public void setProductId(int productId){
		this.productId = productId;
	}

	public int getProductId(){
		return productId;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"Floweritem{" + 
			"instructions = '" + instructions + '\'' + 
			",productId = '" + productId + '\'' + 
			",price = '" + price + '\'' + 
			",name = '" + name + '\'' + 
			",photo = '" + photo + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}
