package varOper_SwitchingValues;

import java.util.Scanner;

//1.Enter 3 numbers from keyboard a1, a2 and a3. Switch their places , so that a1 becomes a2, a2 = a3, a3 = a1;
	
public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int firstNum, secondNum, thirdNum; // Declaration

		System.out.print("Enter a1:");
		firstNum = input.nextInt();

		System.out.print("Enter a2:");
		secondNum = input.nextInt();

		System.out.print("Enter a3:");
		thirdNum = input.nextInt();

		// Switching values WITHOUT Temporary variable !
		
		firstNum += secondNum; // a1 = a1 + a2;
		secondNum = firstNum - secondNum; // a2 = a1 - a2; a2 becomes à1
		firstNum -= secondNum; // a1 = a1 - a2; a1 becomes à2
		thirdNum += secondNum; // a3 = a3 + a2
		secondNum = thirdNum - secondNum; // a2 = a3 - a2; a2 becomes à3
		thirdNum -= secondNum; // a3 = a3 - a2; a3 becomes à2

		// Switching values WITH Temporary variable!

//		int temp = thirdNum; // Temp saves a3 value
//		thirdNum = firstNum; // a3 = a1; a3 becomes a1;
//		firstNum = secondNum; // a1 = a2; a1 becomes a2;
//		secondNum = temp; // a2 = a3 (temp); a2 becomes a3;

		System.out.printf("a1 = %d%na2 = %d%na3 = %d", firstNum, secondNum, thirdNum);
		
		input.close();
	}

}
