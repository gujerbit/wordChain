package util;

import javafx.scene.control.TextField;
import main.AutoTyping;

public class WordVO {
	
	private AutoTyping at;
	
	private TextField txtField;
	
	private String wordArray[];
	
	public void wordList() {
		at = new AutoTyping(txtField);
	}
	
	private void wordListSave() {
		String rk1 = "가.챠.를.돌.려.동.료.를.늘.리.고.최.강.의.미.소.녀.군.단.을.만.들.자"; 
		
		String[] rkArray = rk1.split(".");
	}
	
	private void workSplit() {
		
	}
}
