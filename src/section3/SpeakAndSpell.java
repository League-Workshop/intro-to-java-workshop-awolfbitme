package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("mandlebrot");
		// 2. Catch the user's answer in a String
String input = JOptionPane.showInputDialog("How do you spell the word?");

		// 3. If the user spelled the word correctly, speak "correct"
if(input.equals("mandlebrot")) {
speak("correct");
}
		// 4. Otherwise say "wrong"
else {
	speak("wrong");
}
		// 5. repeat the process for other words
speak("yes");
String input2 = JOptionPane.showInputDialog("how do you spell the word?");
{
if(input2.equals("yes")) {
	speak("correct");
	}
else {
	speak("incorrect");
}
}
}
		
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


