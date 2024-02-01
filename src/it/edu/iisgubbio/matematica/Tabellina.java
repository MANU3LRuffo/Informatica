package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Tabellina extends Application {
	Label lNumero = new Label(" num ");
	TextField tNumero= new TextField();
	Button bCalcolaTabellina = new Button(" tabellina ");
	Label lTabellina = new Label();
	
  public void start(Stage finestra) {
	  


	  GridPane griglia = new GridPane();
	  
	  griglia.add(lNumero, 0, 0);
	  griglia.add(tNumero, 1, 0);
	  griglia.add(bCalcolaTabellina, 0, 1, 5, 1);
	  bCalcolaTabellina.setMaxWidth(10000);
	  griglia.add(lTabellina, 0, 2, 5, 1);
	  lTabellina.setMaxWidth(10000);
	  
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcolaTabellina.setOnAction(e -> calcolaTabellina());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle(" Tabellina");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcolaTabellina(){
	   String stringaNumero = tNumero.getText();
	   int numero= Integer.parseInt(stringaNumero);
	  
	   
	   int n;
	   int risultato=0;
	   
	   String stringaTabellina="0";
	   for(n = 1; n <=10 ;n++){
		   risultato = numero*n;
		   stringaTabellina += ", " +risultato;
	   }
	   lTabellina.setText(stringaTabellina);
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}

