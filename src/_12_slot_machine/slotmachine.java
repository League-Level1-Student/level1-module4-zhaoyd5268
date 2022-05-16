package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
	JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton SPIN = new JButton();

	public void setup() {
		 try {
				JLabel label = createLabelImage("7.jpeg");

				JLabel label1 = createLabelImage("istockphoto-185284489-612x612.jpeg");
				JLabel label2 = createLabelImage("unnamed.jpeg");
				panel.add(label);
				panel.add(label1);
				panel.add(label2);
				panel.add(SPIN);
				frame.add(panel);
				frame.pack();
				 frame.add(panel);
					frame.pack();
				 frame.setVisible(true);
			SPIN.addActionListener(this);
frame.pack();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	frame.pack();
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

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i<3; i++) {
			Random random = new Random();
		int ran = random.nextInt(3);
		if (ran==0) {
		try {
			createLabelImage("7.jpeg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		} else if (ran==1) {
			try {
				createLabelImage("istockphoto-185284489-612x612.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (ran==2) {
			try {
				createLabelImage("unnamed.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		frame.pack();
		}
		}


    
}
