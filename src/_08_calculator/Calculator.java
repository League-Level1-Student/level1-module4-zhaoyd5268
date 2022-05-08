package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

		
	
	JButton button = new JButton();
JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JLabel label = new JLabel();
	JTextField text = new JTextField();
	JTextField text1 = new JTextField();

	JFrame frame = new JFrame();

	public void setup() {
	frame.setVisible(true);
	frame.add(panel);
		button.setText("add");
		panel.add(button);
		button.addActionListener(this);
		button1.setText("subtract");
		panel.add(button1);
		button1.addActionListener(this);
		button2.setText("multiply");
		panel.add(button2);
		button2.addActionListener(this);
		button3.setText("divide");
		panel.add(button3);
		button3.addActionListener(this);
		panel.add(label);
		panel.add(text);
		panel.add(text1);
		text.setPreferredSize(new Dimension(100, 30));
		text1.setPreferredSize(new Dimension(100, 30));
		frame.pack();
	}

	
	public void add() {
		int value1 = Integer.parseInt(text.getText());
		int value2 = Integer.parseInt(text1.getText());
		label.setText("" + (value1+value2));

	}
	public void subtract() {

		int value1 = Integer.parseInt(text.getText());
		int value2 = Integer.parseInt(text1.getText());
		label.setText("" + (value1-value2));

	}
	public void multiply() {

		int value1 = Integer.parseInt(text.getText());
		int value2 = Integer.parseInt(text1.getText());
		label.setText("" + value1*value2);

	}
	public void divide() {

		double value1 = Double.parseDouble(text.getText());
		double value2 = Double.parseDouble(text1.getText());
		label.setText("" + value1/value2);

	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			add();
		}
		if (e.getSource()==button1) {
			subtract();
		}
		if (e.getSource()==button2) {
			multiply();
		}
		if (e.getSource()==button3) {
			divide();

		}
		frame.pack();
	}	
}
