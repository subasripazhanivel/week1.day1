package week1.day1;

public class Subasrilearnwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int inputValue = 5876;
		int iquotient = 0;
		int idividedBy = 10;
		int ireminder = 0;
		while (inputValue != 0) {

			ireminder = inputValue % idividedBy;
			iquotient = inputValue / idividedBy;
			sum = sum + ireminder;
			inputValue = iquotient;
		}
		System.out.println("\n Sum of digit is :" + sum);
	}
}
