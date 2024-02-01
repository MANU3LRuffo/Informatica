package it.edu.iisgubbio.negozio;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AgenziaViaggi extends Application {
	
	Label lPersoneAutobus = new Label(" persone per autobus ");
	TextField tPersoneAutobus = new TextField();
	Label lPartecipanti= new Label(" partecipanti ");
	
	TextField tPartecipanti = new TextField();
	Label lCostoAutobus= new Label(" costo autobus ");
	
	TextField tCostoAutobus = new TextField();
	Button bCalcolaBiglietto = new Button(" calcola biglietto");
	
	Label lCostoBiglietto = new Label(" costo biglietto ");
	Label lNumeroBiglietto = new Label();

  public void start(Stage finestra) {
	  
	  GridPane griglia = new GridPane();
	  
	 
	  griglia.add( lPersoneAutobus, 0, 0);
	  griglia.add( tPersoneAutobus, 1, 0);
	  griglia.add( lPartecipanti, 0, 1);
	  griglia.add( tPartecipanti, 1, 1);
	  griglia.add( lCostoAutobus, 0, 2);
	  griglia.add( tCostoAutobus, 1, 2);
	  griglia.add( bCalcolaBiglietto, 0, 3, 2, 4);
	  bCalcolaBiglietto.setMaxWidth(1000);
	  griglia.add( lCostoBiglietto, 0, 7);
	  griglia.add( lNumeroBiglietto, 1, 7); 
	  
	  bCalcolaBiglietto.setOnAction(e -> calcolaBiglietto());
	  
    Scene scena = new Scene(griglia,  300, 200);

    finestra.setTitle(" Agenzia Viaggi");
    finestra.setScene(scena);
    finestra.show();
  }
  
  private void calcolaBiglietto(){
	  
	  String stringaPersoneAdAutobus;
	   String stringaPartecipanti;
	   String stringaCostoAutobus;
	   
	   double personeAdAutobus;
	   double partecipanti;
	   double costoAutobus;
	   double bus;
	   
	   stringaPersoneAdAutobus = tPersoneAutobus.getText();
	   stringaPartecipanti = tPartecipanti.getText();
	   stringaCostoAutobus = tCostoAutobus.getText();
	   
	   personeAdAutobus =Double.parseDouble(stringaPersoneAdAutobus);
	   partecipanti = Double.parseDouble(stringaPartecipanti);
	   costoAutobus = Double.parseDouble(stringaCostoAutobus);
	   
	   if ((partecipanti % personeAdAutobus )>0) {
		   bus = (personeAdAutobus / partecipanti)+1;
	   } else {
		   bus = (personeAdAutobus / partecipanti);
	   }
	   
	   double biglietto=(costoAutobus * (partecipanti / personeAdAutobus) / partecipanti);
	   lNumeroBiglietto.setText("il costo del biglietto è " +biglietto);
	    
	   
  }
  public static void main(String[] args) {
	  
    launch(args);
  }
}