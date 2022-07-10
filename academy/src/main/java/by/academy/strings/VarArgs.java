package by.academy.strings;

public class VarArgs {
	static void test(int... array) {
		System.out.println("ARGUMENTS " + array.length);
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

//	static void test(int[] array) {
//	}

	public static void main(String[] args) {
		test();
		test(1);
		test(1, 2);
		test(new int[] { 1, 3 });
	}

}