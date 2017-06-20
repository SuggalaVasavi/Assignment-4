package io.swagger.client.model;

import io.swagger.client.model.Pet;

public class NewPet {
	public static void main(String args[]){
Pet pet=new Pet();
pet.setId(1234L);
pet.setName("vvvv");
System.out.println("id:"+pet.getId());
System.out.println("Name:"+pet.getName());


}
}