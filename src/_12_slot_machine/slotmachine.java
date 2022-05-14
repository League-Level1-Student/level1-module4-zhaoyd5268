package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine {
	JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton SPIN = new JButton();
	public void setup() {
		 try {
				JLabel label = createLabelImage("7.jpeg");
				frame.add(label);
				JLabel label1 = createLabelImage("istockphoto-185284489-612x612.jpeg");
				frame.add(label1);
				JLabel label2 = createLabelImage("unnamed.jpeg");
				frame.add(label2);
				panel.add(label2);
				panel.add(label);
				panel.add(label1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
frame.add(panel);

		 frame.setVisible(true);
	frame.pack();
	}
	public static void main(String[] args) {
		slotmachine slot = new slotmachine();
		slot.setup();
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    
}
