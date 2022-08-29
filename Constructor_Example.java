package com.GitHub_Updates;
/*
  Constructor are special members that are used to create objects.
  In constructor class name and method name will be same.
  look like method but doesn't have return type.
  create object but no need to call. 
*/
class A{

	A()
	{
		System.out.println("Hello");
	}
	//Constructor with parameter
	A(String a)
	{
		System.out.println("Hai "+a);
	}
	//overloading
	A(int a)
	{
		System.out.println("Hai "+a);
	}
}
public class Constructor_Example {

	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new A("007");
		A obj2 = new A(7);
	}
}
