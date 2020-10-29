package com.cg.customer.entities;

import java.util.Objects;

public class Customer {

	private long id;
	
	private String name;
	
	
	public Customer() {
		
	}
	
	public Customer(String name){
		this.name=name;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id2) {
		this.id = id2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		int hash=Objects.hashCode(id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer that = (Customer) obj;
		if (this.id != that.id)
			return false;
		return true;
	}
}
