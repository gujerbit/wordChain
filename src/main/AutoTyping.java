package main;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;

import com.sun.glass.events.KeyEvent;

import javafx.scene.control.TextField;

public class AutoTyping {
	private TextField txtField;
	
	public AutoTyping(TextField txtField) {
		this.txtField = txtField;
		mouseCoordinate();
	}
	
	public void typing() throws AWTException {
		Robot robot = new Robot();
		
		int rkArray[] = {KeyEvent.VK_R, KeyEvent.VK_K, KeyEvent.VK_S, KeyEvent.VK_K};
		
		if(txtField.getText().equals("가")) {
			for(int i = 0; i < rkArray.length; i++) {
				robot.keyPress(rkArray[i]);
				robot.keyRelease(rkArray[i]);
			}
		}
	}
	
	private void mouseCoordinate(){
		// 마우스 좌표 알아내는 코드
		PointerInfo mp = MouseInfo.getPointerInfo();
		
		while(true) {
			mp = MouseInfo.getPointerInfo();
			
			System.out.println(mp.getLocation());
		}
	}
}
