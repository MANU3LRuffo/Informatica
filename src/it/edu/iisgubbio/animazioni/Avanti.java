package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;




public class Avanti extends Application {
	Button bPartire = new Button("via");
	int x= 10;
	boolean destra=true;
	Circle palla = new Circle(10);
	Timeline timeline = new Timeline(new KeyFrame( 
			Duration.millis(1),
			x -> aggiornaTimer()
			));

	
	public void start(Stage finestra) {
		Pane quadro= new Pane();

		GridPane griglia = new GridPane();

		griglia.add(bPartire, 2, 0);
		griglia.add(quadro, 0, 1, 3, 1);


		Scene scena = new Scene(griglia, 300, 200);

		finestra.setTitle(" Avanti Pallina ");
		finestra.setScene(scena);
		finestra.show();

		timeline.setCycleCount(timeline.INDEFINITE);
		bPartire.setOnAction(e -> via());
		palla.setFill(Color.ORANGE);
		quadro.getChildren().add(palla);
		palla.setCenterX(x);
		palla.setCenterY(10);
	}

	private void via() {
		timeline.play();
	}

	private void aggiornaTimer(){
		if(x==300) {
			destra=false;
		} 
		if(x==0) {
			destra=true;
		} 
		if(destra==true) {
			x+=5;
			palla.setCenterX(x);
		} else  { //destra==false
			x-=5;
			palla.setCenterX(x);
		}
		
		
	}

	public static void main(String[] args) {

		launch(args);
	}
}
