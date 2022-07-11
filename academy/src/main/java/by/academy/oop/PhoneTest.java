package by.academy.oop;

public class PhoneTest {

	public static void main(String[] args) {
		Phone phone1=new Phone("+375336545986","Nokia",360.23);
		Phone phone2=new Phone("+375293486961","Samsung",360.23);
		Phone phone3=new Phone();
//		phone1.receiveCall("IVAN");
//		phone2.receiveCall("PETER");
//		phone3.receiveCall("ZOUE");
//		phone1.receiveCall("Ivan", "+375336545986");
//		phone1.sendMessageс("+355555","+45646","+456465","+456465","+4564648");
//		phone1.getNumbers("++++6666");
		System.out.println(phone1.equals(phone2));
		System.out.println(phone1.hashCode());
		System.out.println(phone2.hashCode());
		System.out.println(phone1.toString());
		System.out.println(phone2.toString());
	}

}
