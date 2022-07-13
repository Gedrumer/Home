package by.academy.classworks.classwork9;

public class Card1 extends BankAcount {
	String cardHolder;
	private String cardNumber;
	private String validity;
	String color;
	public void setCardHolder(String cardHolder) {
		this.cardHolder=cardHolder;
	}
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber=cardNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setValidity(String validity) {
		this.validity=validity;
	}
	public String getValidity() {
		return validity;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void showCard() {
		System.out.println("Your card: \nCard number: "+cardNumber+"\nCard validity: "+validity+"\nCard color: "+color);
	}
}
