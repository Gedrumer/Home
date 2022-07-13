package by.academy.classworks.classwork9;

public class BankAcount {
	private String iban;
	String bankAcountHolder;
	double money;

	public BankAcount() {

	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getIban() {
		return iban;
	}

	public void setBankAcountHolder(String bankAcountHolder) {
		this.bankAcountHolder = bankAcountHolder;
	}

	public String getBankAcountHolder() {
		return bankAcountHolder;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void deposit(double s) {
		money += s;
		System.out.println("Your money: " + money);
	}

	public void withdraw(double s) {
		money -= s;
		System.out.println("Your money: " + money);
	}

	public void accHolder() {
		System.out.println("Bank acount holder: " + bankAcountHolder);
	}

}
