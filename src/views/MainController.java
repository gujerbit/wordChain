package views;

import java.awt.AWTException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.AutoTyping;

public class MainController {
	private AutoTyping at;
	
	@FXML
	public TextField txtField;
	@FXML
	public TextField txtX;
	@FXML
	public TextField txtY;
	@FXML
	public Button mouseBtn;
	@FXML
	public Button setMouseBtn;
	@FXML
	public Label lblMouse;
	@FXML
	public Label lblX;
	@FXML
	public Label lblY;
	
	public String[] name;
	@FXML
	public void initialize() {
		System.out.println("메인 레이아웃 생성 완료");
		at = new AutoTyping(txtField);
		setMouseBtn.setOpacity(0);
		setMouseBtn.setDisable(true);
		lblMouse.setOpacity(0);
		lblX.setOpacity(0);
		lblY.setOpacity(0);
		txtX.setOpacity(0);
		txtX.setDisable(true);
		txtY.setOpacity(0);
		txtY.setDisable(true);
		keyInput();
	}
	
	public void keyInput() {
		try {
			at.typing();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void getMouseCoordinate() {
		setMouseBtn.setOpacity(1);
		setMouseBtn.setDisable(false);
		lblMouse.setOpacity(1);
		lblX.setOpacity(1);
		lblY.setOpacity(1);
		txtX.setOpacity(1);
		txtX.setDisable(false);
		txtY.setOpacity(1);
		txtY.setDisable(false);
	}
	
	public void setMouseCoordinate() {
		setMouseBtn.setOpacity(0);
		setMouseBtn.setDisable(true);
		lblMouse.setOpacity(0);
		lblX.setOpacity(0);
		lblY.setOpacity(0);
		txtX.setOpacity(0);
		txtX.setDisable(true);
		txtY.setOpacity(0);
		txtY.setDisable(true);
	}
	
}
