package com.org.house.Controllers;

import com.org.house.MainApp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class MainController {
	
	private static MainApp mainApp = new MainApp();
	
	@FXML
	private Button btnLogin;

	@FXML
	private Button btnRegistration;
	
	
	@FXML
	private void initialize() {
		btnLogin.setOnAction(e->{
			
		});
		
	}

}
