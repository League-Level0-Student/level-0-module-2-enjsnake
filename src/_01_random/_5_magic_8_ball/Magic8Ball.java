//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[]args) {
		
	
	// 2. Get the user to enter a question for the 8 ball to answer
		JOptionPane.showInputDialog("Enter a question for the 8 ball");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
		Random ran = new Random(); 
		int answer = ran.nextInt(3);
	
	// 4. If the random number is 0
		if(answer == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
	// -- tell the user "Yes"
		else if(answer == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2
		else if(answer == 2) {
			JOptionPane.showMessageDialog(null, "Go check google");
		}
	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3
		else{
			JOptionPane.showMessageDialog(null, "Try to figure it out yourself");
		}
	// -- write your own answer
	}
}
