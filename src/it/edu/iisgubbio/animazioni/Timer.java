package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Timer extends Application{
	Button bStart = new Button("start");
	Button bPausa = new Button("stop");
	Label lTesto;
	int n=100;
	Timeline timeline = new Timeline(new KeyFrame( 
			Duration.seconds(1),
			x -> aggiornaTimer()
			));

	public void start(Stage primaryStage) throws Exception {
		lTesto = new Label("finestra timer");

		GridPane griglia = new GridPane();
		griglia.add(bStart, 0, 0);
		griglia.add(bPausa, 2, 0);
		griglia.add(lTesto,  0,  2);

		Scene scene = new Scene(griglia,200,100);
		primaryStage.setTitle("Timer!"); 
		primaryStage.setScene(scene);
		primaryStage.show();

		bStart.setOnAction(e -> inizia());
		bPausa.setOnAction(e -> ferma());



		timeline.setCycleCount(100);
		timeline.play();
	}


	private void inizia() {
		timeline.play();
	}
	private void ferma() {
		timeline.stop();
	}


	private void aggiornaTimer(){
		lTesto.setText(""+ (n--));
	}

	public static void main(String args[]){
		launch();
	}
}
