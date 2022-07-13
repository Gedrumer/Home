package by.academy.classworks.classwork9;

public class TestCard {

	public static void main(String[] args) {
		Card1 card=new Card1();
		Card2 cardd=new Card2();
		Card3 carddd=new Card3();
		card.deposit(123);
		card.setBankAcountHolder("Ivan Shcharbina");
		card.accHolder();
		cardd.deposit(400);
		cardd.setBankAcountHolder("Ivan Shcharbina");
		cardd.accHolder();
		card.setColor("RED");
		cardd.setColor("GREEN");
		card.setCardNumber("123456789");
		cardd.setCardNumber("987654321");
		card.setValidity("12.24");
		cardd.setValidity("01.23");
		card.showCard();
		cardd.showCard();
		
	}

}
