package com.capgemini.day10;

public class CreditCard {
	
	private long cardNumber;
	private String name;
	private String bank;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(long cardNumber, String name, String bank) {
		super();
		this.cardNumber = cardNumber;
		this.name = name;
		this.bank = bank;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	

}
