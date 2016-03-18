package Challenges;

import java.util.*;
public class yourName {
	public static void main(String[] args) {

		System.out.println("Hi My name is Vikram, what is your name?");
		Scanner read = new Scanner(System.in);
		String name= read.next();
		System.out.println("Hello " + name + "! Have a great time coding.");
		read.close();
	}
}