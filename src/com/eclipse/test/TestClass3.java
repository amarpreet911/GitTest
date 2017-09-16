package com.eclipse.test;

public class TestClass3 {

	public static void main(String args[]) {
		new TestClass1();
		new TestClass2();
		TestClass3 t3 = new TestClass3();
		t3.finalBlock();
	}
	public void finalBlock() {
		System.out.println("Finally TestClass3 final block added");
	}
}
