package com.OneToMany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "cart")
@Entity

public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cart_id;
	private String name;
	
@OneToMany(cascade =CascadeType.ALL) // when we perform same action on the target entity
	//The same action will be applied to the associated entity
	@JoinColumn(name="cid")
	private List<Item> item;

public int getCart_id() {
	return cart_id;
}

public void setCart_id(int cart_id) {
	this.cart_id = cart_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Item> getItem() {
	return item;
}

public void setItem(List<Item> item) {
	this.item = item;
}

}
