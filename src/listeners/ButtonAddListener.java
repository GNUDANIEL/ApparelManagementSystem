package listeners;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.ApparelAdder;
import gui.ApparelViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;	
	}
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e. getSource();
		ApparelAdder adder = frame.getAppareladder();
		frame.setupPanel(adder);
	}
}
