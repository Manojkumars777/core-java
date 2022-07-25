package com.xworkz.customer.dto;

import lombok.Data;

@Data                         /*@Data is a annotation from LOMBOX it cotains @Getter,@Setter,@ReuiredArgsConstructor,@EqualsAndhashCode,@ToString*/
public class OrderDTO {
	
	/*public OrderDTO() {
		// TODO Auto-generated constructor stub
	}*/
	
	 private int id;
	 private String name;
	 private int quantity;
	 private String type;
	 
	 
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}*/
	 
 }
