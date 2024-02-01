package it.edu.iisgubbio.vettore;

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
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Nuotatore extends Application {
	
	Label lNumeroTempi = new Label("Numero tempo");
	Label lTempo= new Label("Inserisci tempo");
	Label lCoach= new Label("Tempo del coach");
	Label lPessimi= new Label("Risultati negativi");
	TextField tNumeroVasche= new TextField();
	TextField tTempo = new TextField();
	TextField tAllenatore = new TextField();
	Button bCreaVettore= new Button("Crea vettore");
	Button bInserisciTempo= new Button("Inserisci Tempo");
	Button bRisultati= new Button("Risultati negativi");
	Label lRisultati = new Label();
	int tempi[];
	int numeroTempi;
	int pos;
	
	public void start(Stage finestra) {
		
		GridPane griglia = new GridPane();
		
		griglia.add(lNumeroTempi, 0, 0);
		griglia.add(lTempo, 0, 1);
		griglia.add(lCoach, 0, 2);
		griglia.add(lPessimi, 0, 3);
		griglia.add(lRisultati, 3, 1);
		griglia.add(tNumeroVasche, 1, 0);
		griglia.add(tTempo, 1, 1);
		griglia.add(tAllenatore, 1, 2);
		griglia.add(bCreaVettore, 2, 0);
		griglia.add(bInserisciTempo, 2, 1);
		griglia.add(bRisultati, 2, 2);
		
		
		Scene scena = new Scene(griglia);
		finestra.setTitle(" Nuotatore ");
		finestra.setScene(scena);
		finestra.show();

		
		bCreaVettore.setOnAction(e -> creavettore());
		bInserisciTempo.setOnAction(e -> inserisciTempo());
		bRisultati.setOnAction(e -> contaPessimi());
		
	}
	
	public void creavettore() {
	      numeroTempi = Integer.parseInt(tNumeroVasche.getText());
	      tempi = new int[numeroTempi];
	      
	   }
	
	public void inserisciTempo() {
	      if(pos < numeroTempi) {
	         tempi[pos++]=Integer.parseInt(tTempo.getText());
	         tTempo.setText("");
	         }
	      }
	public void contaPessimi() {
	      int indice, contatore;
	      int coach = Integer.parseInt(tAllenatore.getText());
	      for(contatore = indice = 0; indice < tempi.length; indice++) {
	         if(tempi[indice] > coach) {
	            contatore++;
	         }
	      }
	      lRisultati.setText("" + contatore);
	   }
	public static void main(String[] args) {

		launch(args);
	}
}
