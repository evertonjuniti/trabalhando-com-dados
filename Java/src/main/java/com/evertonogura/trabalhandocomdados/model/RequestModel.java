package com.evertonogura.trabalhandocomdados.model;

import java.io.Serializable;
import java.util.Objects;

public class RequestModel implements Serializable {

	private static final long serialVersionUID = -7713860407818617728L;
	
	private String description;
	
	private int amount;
	
	private String foodType;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		return "RequestModel [description=" + description + ", amount=" + amount + ", foodType=" + foodType + "]";
	}

	public RequestModel(String description, int amount, String foodType) {
		super();
		this.description = description;
		this.amount = amount;
		this.foodType = foodType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, description, foodType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestModel other = (RequestModel) obj;
		return amount == other.amount && Objects.equals(description, other.description)
				&& Objects.equals(foodType, other.foodType);
	}
	
}
