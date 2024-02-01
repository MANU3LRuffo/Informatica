package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Barra extends Application{
	Label lSimbolo = new Label(" siimbolo: ");
	TextField tTestoSimbolo = new TextField();
	Button bStart = new Button(" via ");
	Label lMillisecondi = new Label(" millisecondi: ");
	TextField tTestoMillisecondi = new TextField();
	Label lRisultato = new Label();
	int numeroSimboli=0;
	

	public void start(Stage finestra) {

		GridPane griglia = new GridPane();
		
		griglia.add(lSimbolo, 0, 0);
		griglia.add(tTestoSimbolo, 1, 0);
		griglia.add(lMillisecondi, 0, 1);
		griglia.add(tTestoMillisecondi, 1, 1);
		griglia.add(lRisultato, 0, 2, 3, 1);
		lRisultato.getMaxWidth();
		griglia.add(bStart, 2, 0);

		Scene scene = new Scene(griglia);
		finestra.setTitle("Barra"); 
		finestra.setScene(scene);
		finestra.show();

		bStart.setOnAction(e -> inizia());
		
	}

	private void inizia() {
		String stringaMillisecondi= tTestoMillisecondi.getText();
		int tempo= Integer.parseInt(stringaMillisecondi);
		Timeline timeline = new Timeline(new KeyFrame( 
			Duration.millis(tempo),
			x -> aggiornaTimer()));
		timeline.setCycleCount(timeline.INDEFINITE);
			timeline.play();

	}


	private void aggiornaTimer(){
		numeroSimboli++;
		String stringaSimbolo = tTestoSimbolo.getText();
		String stringaBarra="";
		
		for(int n=0; n<=numeroSimboli;n++) {
			stringaBarra= stringaBarra+stringaSimbolo;
		}
		lRisultato.setText(stringaBarra);
	}

	public static void main(String args[]){
		launch();
	}
}
