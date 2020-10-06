package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {
	
	public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");	
	int intAge = Integer.parseInt(age);
	if (intAge<18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Who do you think wil be the next president?");
	}
		
	}

}
