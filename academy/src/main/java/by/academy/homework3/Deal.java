package by.academy.homework3;

import java.time.LocalDate;

public class Deal {
	private LocalDate today = LocalDate.now();
	private User buyer;
	private User seller;
	private Product[] prod;
	private int index = 0;
	private LocalDate deadline = today.plusDays(10);

	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, Product[] prod) {
		super();
		getDate();
		this.seller = seller;
		this.buyer = buyer;
		this.prod = prod;
		this.index = prod.length;
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

	private void grow() {
		int newLength = (int) (prod.length == 0 ? 1 : prod.length * 1.5);
		Product[] newProd = new Product[newLength];
		System.arraycopy(prod, 0, newProd, 0, prod.length);
		prod = newProd;
	}

	public void addProduct(Product prods) {
		if (index == prod.length) {
			grow();
		}
		prod[index++] = prods;

	}

	public Product getProduct(int productIndex) {
		return prod[productIndex];
	}

	public void removeProduct(int delete) {
		delete = delete - 1;
		Product[] newProd = new Product[prod.length - 1];
		System.arraycopy(prod, 0, newProd, 0, delete);
		System.arraycopy(prod, delete + 1, newProd, delete, prod.length - delete - 1);
		prod = newProd;
	}

	public void getDeadline() {
		System.out.println("Date of deadline:" + deadline);
	}

	public void doDeal() {
		if (buyer.getMoney() < getSum()) {
			System.out.println("You don't have enough money");
		} else if (buyer.getMoney() > getSum()) {
			double q = buyer.getMoney() - getSum();
			buyer.setMoney(q);
			double w = seller.getMoney() + getSum();
			seller.setMoney(w);

		}
	}

	@Override
	public String toString() {
		StringBuilder deal = new StringBuilder();
		deal.append("Date:");
		deal.append(getDate());
		deal.append(", purchase amount:");
		deal.append(getSum());
		deal.append(", your balance:");
		deal.append(seller.getMoney());
		return deal.toString();
	}

}
