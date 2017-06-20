package io.swagger.client.model;

public class NewUser {
		public static void main(String args[]){
			User user=new User();
			user.setEmail("email@gmail.com");
			user.setFirstName("firstName");
			user.setId(1L);
			user.setLastName("lastName");
			user.setPassword("password");
			user.setPhone("1234567890");
			user.setUsername("username");
			user.setUserStatus(6);
			System.out.println("email:"+user.getEmail());
			System.out.println("firstname:"+user.getFirstName());
			System.out.println("id:"+user.getId());
			System.out.println("lastname:"+user.getLastName());
			System.out.println("password:"+user.getPassword());
			System.out.println("phone:"+user.getPhone());
			System.out.println("username:"+user.getUsername());
			System.out.println("status:"+user.getUserStatus());
		}

}
