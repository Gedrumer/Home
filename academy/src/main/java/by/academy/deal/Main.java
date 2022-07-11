package by.academy.deal;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		Deal io=new Deal();
//		io.setProductName("milk bananas oranges");
//		String[] user3=io.getProductName();
//		System.out.println(Arrays.toString(user3));
		Product prod=new Product();
		Cheese ch=new Cheese();
		prod.setQuantity(20);
		System.out.println(prod.discount());
		ch.setRichness(10);
		System.out.println(ch.discount());
	}

}
