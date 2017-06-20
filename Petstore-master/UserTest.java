package io.swagger.client.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.swagger.client.ApiException;

public class UserTest {
	public static void main(String[] args) throws IOException {
		List<String> status = new ArrayList<String>();
		status.add("sold");

		 UserApi api = new UserApi();

		try {
			System.out.println(api.getUserByName("abcd"));
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
