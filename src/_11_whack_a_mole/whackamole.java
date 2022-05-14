package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackamole implements ActionListener {
	JFrame frame  = new JFrame();
	int increase1 = 0;
	int increase = 0;
	Date TimeAtStart = new Date();
public void drawbuttons(int n) {

	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	frame.pack();

	for(int i = 0; i<30; i++) {
		JButton button = new JButton();
		button.addActionListener(this);
		panel.add(button);
	
		if (i==n) {
			button.setText("mole!");
		}
		frame.pack();
	}
	}
public static void main(String[] args) {
whackamole mole = new whackamole();
Random random = new Random();
int ran = random.nextInt(30);
mole.drawbuttons(ran);
	

	
}
@Override
public void actionPerformed(ActionEvent e) {	
	JButton pressed = (JButton) e.getSource();
		if (!pressed.getText().contentEquals("mole")) {
			 speak("You missed. Sorry!");
				increase+=1;
				increase1+=1;
} else {

	increase+=1;
}
	   frame.dispose();
	  Random random = new Random();
	   int ran = random.nextInt(30);
	   drawbuttons(ran);

	  if (increase==10) {
endGame(TimeAtStart, increase1);
	  }
}
static void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}

}