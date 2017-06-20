package io.swagger.client.model;

public class NewCategory {
public static void main(String args[]){ 
	Category category=new Category();
	category.setId(120L);
	category.setName("abcd");
	System.out.println("Id:"+category.getId());
	System.out.println("Name:"+category.getName());
}
}
