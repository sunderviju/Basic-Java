package com.calculator;

import java.util.Scanner;

public class Calculator {

	static int firstNumber;
	static int secoundNumber;

	int addition(int firstNumber, int secoundNumber) {
		this.firstNumber = firstNumber;
		this.secoundNumber = secoundNumber;
		int result = firstNumber + secoundNumber;
		return result;
	}

	int subtraction(int firstNumber, int secoundNumber) {
		this.firstNumber = firstNumber;
		this.secoundNumber = secoundNumber;
		int result = firstNumber - secoundNumber;
		return result;
	}

	int multiplication(int firstNumber, int secoundNumber) {
		this.firstNumber = firstNumber;
		this.secoundNumber = secoundNumber;
		int result = firstNumber * secoundNumber;
		return result;
	}

	float division(int firstNumber, int secoundNumber) {
		this.firstNumber = firstNumber;
		this.secoundNumber = secoundNumber;
		float result = firstNumber / secoundNumber;
		return result;
	}

	public static void main(String[] argu) {

		Scanner value = new Scanner(System.in);
		Calculator object = new Calculator();

		while (true) {
			System.out.println("1-Addition \n2-Subtraction \n3-Multiplication \n4-Division \nEnter Option");
			int select = value.nextInt();
			System.out.println("Enter First No");
			firstNumber = value.nextInt();
			System.out.println("Enter Secound No");
			secoundNumber = value.nextInt();
			switch (select) {
			case 1:
				System.out.println("Addition"+object.addition(firstNumber, secoundNumber));
				break;
			case 2:
				System.out.println("Subtraction"+object.subtraction(firstNumber, secoundNumber));
				break;
			case 3:
				System.out.println("Multiplication"+object.multiplication(firstNumber, secoundNumber));
				break;
			case 4:
				System.out.println("Devision"+object.division(firstNumber, secoundNumber));
				break;
			default:
				System.out.println("Invalid Number");
				System.exit(0);
			}

		}

	}

}
