package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What is 5+10?");
		// 3.  Use an if statement to check if their answer is correct
		
		if(input.contentEquals("15")) { 
			JOptionPane.showMessageDialog(null, "Your answer is correct.");
			score = score+1;
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Your answer is incorrect.");
		}

		String input2 = JOptionPane.showInput
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
	}
}
