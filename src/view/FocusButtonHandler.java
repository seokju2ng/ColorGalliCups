package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class FocusButtonHandler implements ActionListener{
	private JPanel panel;
	
	public FocusButtonHandler(JPanel panel) {
		this.panel = panel;
	}
	public void actionPerformed(ActionEvent e) {
		panel.requestFocusInWindow();
	}
}
