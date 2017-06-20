package io.swagger.client.model;

import io.swagger.client.model.Order.StatusEnum;

public class NewOrder {
	public static void main(String args[]){
Order order=new Order();
Order.StatusEnum statusenum=Order.StatusEnum.PLACED;
StatusEnum[] ss=Order.StatusEnum.values();
order.setId(120L);
order.setPetId(10L);
order.setQuantity(10);
order.setShipDate(null);
order.setStatus(statusenum);
System.out.println("id:"+order.getId());
System.out.println("petid:"+order.getPetId());
System.out.println("Quantity:"+order.getQuantity());
System.out.println("shipdate:"+order.getShipDate());
System.out.println("status:"+order.getStatus());
}
}