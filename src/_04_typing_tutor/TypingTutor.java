package _04_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.scene.control.Label;


public class TypingTutor implements KeyListener {
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
	JLabel label = new JLabel();
	public void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		currentLetter = generateRandomLetter();
		
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
	
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	System.out.println("You typed: " + e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	if (e.getKeyChar()== currentLetter) {
		System.out.println("Correct!");
		panel.setBackground(Color.GREEN);
	} else {
		panel.setBackground(Color.RED);
		System.out.println("That is incorrect.");
	}
	}

}
