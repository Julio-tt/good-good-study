package test;

public class Number {
	private int n1;
	private int n2;

	public Number() {
		n1 = 6;
		n2 = 2;

	}

	void addition() {
		System.out.println("������Ϊ��" + (n1 + n2));
	}

	void subtration() {
		System.out.println("������Ϊ��" + (n1 - n2));
	}

	void multiplication() {
		System.out.println("������Ϊ��" + (n1 * n2));
	}

	void division() {
		System.out.println("������Ϊ��" + (n1 / n2));
	}

	public static void main(String args[]) {
		Number N = new Number();
		N.addition();
		N.subtration();
		N.multiplication();
		N.division();
	}
}
