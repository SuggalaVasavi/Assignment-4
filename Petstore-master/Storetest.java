package io.swagger.client.api;

	import java.io.IOException;


	import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.*;
import io.swagger.client.model.Order;

	public class Storetest {

		public static void main(String[] args) throws IOException {
		
			StoreApi store = new StoreApi();

			try {
			   Order response = store.getOrderById("120");
				
				System.out.println(response);
			} catch (ApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}