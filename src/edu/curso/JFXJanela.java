package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JFXJanela extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Pane painel = new Pane();
		//painel.setStyle("-fx-background-color:rgba(28,67,114, 0.5);");
		painel.setStyle("-fx-background-image:url(/image/PAPEL_LABORATÓRIOS.png);");
		Scene cena_um = new Scene(painel, 640, 480);

		stage.setTitle("Stege 1");
		stage.setScene(cena_um);
        Label hello = new Label("Hello World!");
        Button btn = new Button("OK");
        btn.relocate(10, 20);
        painel.getChildren().add(hello);
        painel.getChildren().add(btn);
       
		
		
		stage.show();
	}

}
