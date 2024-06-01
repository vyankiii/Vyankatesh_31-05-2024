package com.javaStrings;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charValue = 'S';
		System.out.println(charValue);

		char name[] = { 'V', 'e', 'n', 'k', 'a', 't' };

		System.out.println(name);
		System.out.println(name.hashCode());

		String myName = "Venkat";// literal way of creating an object
		String myFirstName = new String("Venkat");// using new keyword creating an object

		System.out.println(myFirstName);
		System.out.println(myName);
		myName.concat(" Rao");// added new string
		System.out.println(myName);
		System.out.println(myName.hashCode());

	}

}
