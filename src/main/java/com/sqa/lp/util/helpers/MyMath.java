/**
 *   File Name: MyMath.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.lp.util.helpers;

import java.util.ArrayList;

/**
 * MyMath //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class MyMath {
	// A static method which divides one number by another 1/2
	public static double divideNumbers(double num1, double num2) {
		double result = 0;
		if (num2 != 0) {
			result = num1 / num2;
		} else {
			System.out.println("Denominator is 0 making the result indefinite, hence returning 0 ");
		}
		return result;
	}

	// A static method which let the user know if there is a clean division with
	// no remainder
	public static boolean hasCleanDivision(double number, double number1) {
		return true;
	}

	// A static method which multiplies a set of numbers
	public static double multNumbers(double... nums) {
		double result = 1;
		for (int i = 0; i < nums.length; i++) {
			result *= nums[i];
		}
		return result;

	}

	// A static method which multiplies a given number by the amount
	public static double powerNumber(double number, double power) {
		// Create a variable to hold to final result and setting it to power of
		// 1
		double result = 1;
		if (power > 1) {
			result = 1;
			for (int i = 0; i < power; i++) {
				result *= number;
			}
		} else if (power == 1) {
			result = number;
		} else {
			System.out.println("Power is 0 or less, returning 1");
		}

		return result;
	}

	private ArrayList<String> operations;

	private double result;

	// Default Constructor
	public MyMath() {
		setResult(0);
		this.operations = new ArrayList<String>();
		this.operations.add("Start Calculations from " + getTotal());
	}

	// Argument Constructor, starting value given
	public MyMath(double defaultNum) {
		setResult(defaultNum);
		this.operations = new ArrayList<String>();
		this.operations.add("Start Calculations from " + getTotal());
	}

	// To add a number to total
	public double add(double num) {
		this.operations.add("Add " + num + " to " + getTotal());
		setResult(getResult() + num);

		return getTotal();
	}

	public void displayOperations(int numberOfOperations) {
		for (int i = 0; i < this.operations.size(); i++) {
			System.out.println(this.operations.get(i));
		}
	}

	// To divide a number to total
	public double div(double num) {
		this.operations.add("Divide " + getTotal() + " by " + num);
		if (num != 0) {
			setResult(getResult() / num);
		} else {
			System.out.println("Denominator is 0");
		}
		return getTotal();
	}

	// To get the current total
	public double getTotal() {
		return getResult();
	}

	// To multiply a number to total
	public double mult(double num) {
		this.operations.add("Multiply " + getTotal() + " by " + num);
		setResult(getResult() * num);
		return getTotal();
	}

	// To reset total to 0
	public double reset() {
		setResult(0);
		return getTotal();

	}

	// To subtract a number to total
	public double sub(double num) {
		this.operations.add("Subtract " + num + " from " + getTotal());
		setResult(getResult() - num);
		return getTotal();
	}

	/**
	 * @return
	 */
	private double getResult() {

		return this.result;
	}

	/**
	 * @param i
	 */
	private void setResult(double result) {
		this.result = result;
	}
}
