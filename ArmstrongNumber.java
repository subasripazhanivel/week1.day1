package assignments.day1;

/*
 * Goal: To find whether a number is an Armstrong number or not
 * 
 * inputs: 153
 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 153;
		int calculated = 0;
		int remainder;
		int original;

		original = input;

		while (input > 0) {
			remainder = input % 10;
			input = input / 10;

			calculated += (remainder) * (remainder) * (remainder);

		}

		if (calculated == original) {
			System.out.println("This is an Amstrong Number: " + calculated);

		} else {

			System.out.println("This is not an Amstrong Number: " + input);
		}
	}

}
