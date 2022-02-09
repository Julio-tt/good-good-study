package test;

public class Number {
	private int n1;
	private int n2;

	public Number() {
		n1 = 6;
		n2 = 2;

	}

	void addition() {
		System.out.println("两数和为：" + (n1 + n2));
	}

	void subtration() {
		System.out.println("两数差为：" + (n1 - n2));
	}

	void multiplication() {
		System.out.println("两数积为：" + (n1 * n2));
	}

	void division() {
		System.out.println("两数商为：" + (n1 / n2));
	}

	public static void main(String args[]) {
		Number N = new Number();
		N.addition();
		N.subtration();
		N.multiplication();
		N.division();
	}
}
