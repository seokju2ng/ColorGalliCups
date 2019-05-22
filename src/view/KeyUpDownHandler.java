package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class KeyUpDownHandler extends KeyAdapter
{
	private Integer cor;
	private JLabel leftCursorArr[];
	private JLabel rightCursorArr[];
	private int num;
	public KeyUpDownHandler(Integer cor, int num,  JLabel[] leftCursorArr, JLabel[] rightCursorArr) {
		this.cor = cor;
		this.num = num;
		this.leftCursorArr = leftCursorArr;
		this.rightCursorArr = rightCursorArr;

		System.out.println("keyupdown"+leftCursorArr);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("down");
			if (cor != num) {
				leftCursorArr[cor].setVisible(false);
				rightCursorArr[cor].setVisible(false);
				cor = cor + 1;
				leftCursorArr[cor].setVisible(true);
				rightCursorArr[cor].setVisible(true);
			}
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("up");
			if (cor != 0) {
				leftCursorArr[cor].setVisible(false);
				rightCursorArr[cor].setVisible(false);
				cor = cor - 1;
				leftCursorArr[cor].setVisible(true);
				rightCursorArr[cor].setVisible(true);
			}
		} 
	}

}
