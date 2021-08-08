package assignments.day1;

public class SubasriFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 5;
		int fact = 1;
	int i=1;
		
	/*	for (int i = 1; i <= input; i++) {
		fact = fact * i;
		}
	System.out.println("\n\n Factorial of given input is: " + fact);  */
		
		while(i<=input) {
			fact=fact *i;
					i++;
			}
		System.out.println("\n\n Factorial of given input is: " + fact);
	}
		
	
		

}
