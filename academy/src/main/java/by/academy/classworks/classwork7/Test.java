package by.academy.classworks.classwork7;


public abstract class Test {

	public static void main(String[] args) {
		Phone ph = new Phone();
		ph=new Phone("NAMA","NANANA");
		ph.recieveCall("nana","123123123");
		System.out.println(ph.number);
		System.out.println(ph.model);
		ph.sendMessage("asdad","123","1234","123445");
	}

}
