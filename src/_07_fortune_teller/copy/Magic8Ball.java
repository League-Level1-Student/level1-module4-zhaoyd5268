package _07_fortune_teller.copy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int rnumber = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(rnumber);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showMessageDialog(null, "Ask any yes/no question to me");
	// 5. If the random number is 0
if (rnumber==0) {
	System.out.println("Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (rnumber==1) {
	System.out.println("No");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (rnumber==2) {
	System.out.println("Maybe you should ask Google?");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (rnumber==3) {
	System.out.println("I think you should decide that.");
}
	// -- write your own answer
}
}
