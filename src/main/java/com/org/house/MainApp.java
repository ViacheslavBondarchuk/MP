package com.org.house;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {
	
	private Parent rootNode = null;
	private static final Logger log = LoggerFactory.getLogger(MainApp.class);
	
    public void setRootNode(Parent rootNode) {
		this.rootNode = rootNode;
	}

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        log.info("Starting Manager password");

        String fxmlFile = "/fxml/MainScene.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));

        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode);

        stage.setTitle("Manager password");
        stage.setResizable(false);
        stage.setFullScreen(false);
        stage.setScene(scene);
        stage.show();
    }
}
