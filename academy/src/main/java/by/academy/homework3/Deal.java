package by.academy.homework3;

import java.time.LocalDate;

public class Deal {
	private LocalDate today = LocalDate.now();
	private User buyer;
	private User seller;
	private Product[] prod;

	public Deal() {

	}

	public Deal(User seller, User buyer, Product[] prod) {
		super();
		getDate();
		this.seller = seller;
		this.buyer = buyer;
		this.prod = prod;

	}

	public User getSeller() {
		return seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public Product[] getProducts() {
		return prod;
	}

	public void cheque() {
		System.out.println();
	}

	public LocalDate getDate() {
		return today;
	}

	public double getSum() {
		double s = 0;
		for (Product p : prod) {
			s += p.getProductPrice();
		}
		return s;
	}

}
