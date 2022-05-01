package _08_calculator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
	
	JLabel label = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	public static void main(String[] args) {
		
	}
	JFrame frame = new JFrame();

	
	JTextField text = new JTextField();
	JTextField text1 = new JTextField();
	public void add() {
		label.setText("add");
		frame.add(label);
	}
	public void subtract() {
		label1.setText("subtract");
		frame.add(label1);
	}
	public void multiply() {
		label2.setText("multiply");
		frame.add(label2);
	}
	public void divide() {
		label3.setText("divide");
		frame.add(label3);
	}
}
