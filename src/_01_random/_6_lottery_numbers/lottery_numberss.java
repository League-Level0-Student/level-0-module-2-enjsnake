package _01_random._6_lottery_numbers;

import java.util.Random;

public class lottery_numberss {
public static void main(String[]args) {
	Random ran = new Random();
	int first = ran.nextInt(10);
	int second = ran.nextInt(10);
	int third = ran.nextInt(10);
	int fourth = ran.nextInt(10);
	int fifthj = ran.nextInt(10);
	int last = ran.nextInt(10);
	
	System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifthj + " "+	 last);
	
	
	
	
	
}
}
