package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random randomnumber = new Random();
		int num = randomnumber.nextInt(4);
	// 3.  Print out this variable
System.out.println(num);
	// 4. Get the user to enter something that they think is awesome
String awesome =JOptionPane.showInputDialog("What is something that you think is awesome?");
	// 5. If the random number is 0
if (num == 0){
	JOptionPane.showMessageDialog(null, awesome+ " is awesome!");
	

}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if (num== 1) {
	JOptionPane.showMessageDialog(null, awesome+ "is ok.");
	
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if(num == 2) {
	JOptionPane.showMessageDialog(null, awesome+ "is boring");
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if(num == 3) {
	JOptionPane.showMessageDialog(null,"I don't know what that is.");
}
	// -- write your own answer

}
}

