package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button = new JButton();
	JButton button1 = new JButton();
	
public static void main(String[] args) {
ChuckleClicker chuckleclicker = new ChuckleClicker();
chuckleclicker.makebuttons();
}

public void makebuttons() {
JFrame frame = new JFrame();
frame.setVisible(true);
JPanel panel = new JPanel();

panel.add(button);
panel.add(button1);
frame.add(panel);
button.setText("joke");
button1.setText("punchline");
button.addActionListener(this);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "hi");
if(e.getSource() == button) {
System.out.println("Why does Waldo wear stripes?");
}
if(e.getSource() == button1) {
System.out.println("Because he doesn't want to be spotted!");
}

}

}
