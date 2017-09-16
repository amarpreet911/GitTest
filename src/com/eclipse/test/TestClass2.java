package com.eclipse.test;

public class TestClass2 {
	
	TestClass2(){
		System.out.println("TestClass2 Constructor called");

		System.out.println("Added TestClass2 Constructor");
	}
	public static void main(String[] args) {
		System.out.println("This is the  second test class ");
		System.out.println("Before calling the constructor for class two");
		new TestClass2();
		System.out.println("After calling the constructor for class two");

	}

}
