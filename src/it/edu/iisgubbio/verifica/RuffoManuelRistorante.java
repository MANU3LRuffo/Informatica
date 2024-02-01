package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;


public class RuffoManuelRistorante extends Application {
	Label lNumeroBistecche= new Label(" Numero bistecche: ");
	Label lPrezzoBistecca = new Label(" Prezzo bistecca ");
	Label lNumeroBibite = new Label(" Numero bibite: ");
	Label lPrezzoBibite = new Label(" Prezzo bibite ");
	
	TextField tNumeroBistecche= new TextField();
	TextField tPrezzoBistecca= new TextField();
	TextField tNumeroBibite= new TextField();
	TextField tPrezzoBibite= new TextField();
	
	CheckBox cContorni= new CheckBox(" contorni +1.5€ ");
	CheckBox cSconto= new CheckBox(" sconto 20% ");
	
	Label lTotale= new Label(" Totale ");
	Label lRisultatoTotale = new Label();
	
	
	Button bCalcolaTotale= new Button(" totale ");
	
	
  public void start(Stage finestra) {
	  


	  GridPane griglia = new GridPane();
	  
	  griglia.add(lNumeroBistecche, 0, 0);
	  griglia.add(tNumeroBistecche, 1, 0);
	  
	  griglia.add(lPrezzoBistecca, 0, 1);
	  griglia.add(tPrezzoBistecca, 1, 1);
	  
	  griglia.add(lNumeroBibite, 0, 2);
	  griglia.add(tNumeroBibite, 1, 2);
	  
	  griglia.add(lPrezzoBibite, 0, 3);
	  griglia.add(tPrezzoBibite, 1, 3);
	  
	  griglia.add(cContorni, 1, 5);
	  griglia.add(cSconto, 1, 6);
	  
	  griglia.add(lTotale, 0, 7);
	  griglia.add(lRisultatoTotale, 1, 7);
	  
	  griglia.add(bCalcolaTotale, 0, 4, 5, 1);
	  bCalcolaTotale.setMaxWidth(10000);
	  
	  
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcolaTotale.setOnAction(e -> calcolatotale());
	  
    Scene scena = new Scene(griglia);
    
    scena.getStylesheets().add("it/edu/iisgubbio/verifica/RuffoManuelRistorante.css");
    
    finestra.setTitle(" RuffoManuel ");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcolatotale(){
	   String stringaNumeroBistecche= tNumeroBistecche.getText();
	   String stringaPrezzoBistecca = tPrezzoBistecca.getText();
	   String stringaNumeroBibite= tNumeroBibite.getText();
	   String stringatPrezzoBibite= tPrezzoBibite.getText();
	   
	   
	   double nBistecca = Double.parseDouble(stringaNumeroBistecche);
	   double pBistecca = Double.parseDouble(stringaPrezzoBistecca);
	   double nBibite= Double.parseDouble(stringaNumeroBibite);
	   double pBibite= Double.parseDouble(stringatPrezzoBibite);
	   double totale= (nBistecca * pBistecca) + (nBibite * pBibite);
	   double contorni = 0;
	   double sconto=0;
	   nBistecca= nBistecca + 1.5; 
	   
	   if(cContorni.isSelected()) {
		   totale= nBistecca * 1.5;
		   totale+=contorni;
	   }else {
		   if(cSconto.isSelected() ) {
			   totale = totale-(totale / 100)*20;
			   totale+= sconto;
		   }
	   }
	   lRisultatoTotale.setText(" "+totale);
	 }

  public static void main(String[] args) {
	  
    launch(args);
  }
}

