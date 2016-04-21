/**
 *   File Name: MyMathTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.lp.util.helpers.math;

import static org.testng.Assert.*;

import java.util.*;

import org.testng.annotations.*;

import com.sqa.lp.util.helpers.*;

/**
 * MyMathTests //ADDD (description of class)
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
public class MultiplicationTests {

	@DataProvider
	public static Object[][] getData() {
		Object[][] data = { { new double[] { 2.0, 3.0, 4.0, 2.0 }, 48.0 }, { new double[] { 2.0, 1.0, 5.0 }, 10.0 },
				{ new double[] { 3.0, 1.5 }, 4.5 }, { new double[] { 0.0, 100.0 }, 0.0 },
				{ new double[] { 1.0, 2.0, 2.5, 3.0, 6.0 }, 90.0 }, { new double[] { 1.5, 5.5, 0.0 }, 0.0 } };
		return data;
	}

	private double expectedResult;
	private double[] numbers;

	// @Test
	// public void testDivideNumbers() {
	// double actualResult;
	// double expectedResult = 3.0;
	// double numerator = 12.0;
	// double denominator = 4.0;
	//
	// actualResult = MyMath.divideNumbers(numerator, denominator);
	// String message = String.format("The result of %.0f divided by %.0f is
	// %.0f ", numerator, denominator,
	// actualResult);
	//
	// System.out.println(message);
	// Assert.assertEquals(message, expectedResult, actualResult, 0);
	// }

	@Test(dataProvider = "getData")
	public void testMultNumbers(double[] numbers, double expectedResult) {
		double actualResult = MyMath.multNumbers(this.numbers);
		String numberString = Arrays.toString(this.numbers);

		String errorMessage = String.format(
				"Error: The result of multiplying all numbers %s is actually %.2f not expected.", numberString,
				actualResult);
		String message = String.format("The result of multiplying all numbers %s is %.2f.", numberString, actualResult);

		System.out.println(message);
		assertEquals(this.expectedResult, actualResult, 0, errorMessage);
	}

}
