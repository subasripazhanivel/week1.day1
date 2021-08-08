package assignments.day1;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 79;
		boolean flag = false;
		int remainder;

		for (int i = 2; i < n / 2; i++) {
			remainder = n % i;

			if (remainder == 0) {
				flag = true;
				break;
			}

		}
if(flag==false)
{
	System.out.println("\n\n Given number " +n+ " is prime number");
}else
	
{
	System.out.println("\n\n Given number " +n+ " is not a prime number");
	
}

	}

}
