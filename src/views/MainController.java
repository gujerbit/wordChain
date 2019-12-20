package views;

import java.awt.AWTException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main.AutoTyping;

public class MainController {
	private AutoTyping at;
	
	@FXML
	public TextField txtField;
	
	@FXML
	public void initialize() {
		System.out.println("메인 레이아웃 생성 완료");
		at = new AutoTyping(txtField);
		keyInput();
	}
	
	public void keyInput() {
		try {
			at.typing();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
}
