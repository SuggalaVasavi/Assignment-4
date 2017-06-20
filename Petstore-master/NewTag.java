package io.swagger.client.model;

public class NewTag {
	public static void main(String args[]){
		Tag tag=new Tag();
		tag.setId(100L);
		tag.setName("aa");
		System.out.println("id:"+tag.getId());
		System.out.println("name:"+tag.getName());
	}

}
