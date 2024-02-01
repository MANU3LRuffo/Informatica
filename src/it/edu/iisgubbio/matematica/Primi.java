package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Primi extends Application {
	Label lNumeroPrimo = new Label(" numero ");
	TextField tNumero= new TextField();
	Button bCalcolaPrimi = new Button(" divisori ");
	Label lPrimi = new Label();
	
  public void start(Stage finestra) {
	  


	  GridPane griglia = new GridPane();
	  
	  griglia.add(lNumeroPrimo, 0, 0);
	  griglia.add(tNumero, 1, 0);
	  griglia.add(bCalcolaPrimi, 0, 2, 5, 1);
	  bCalcolaPrimi.setMaxWidth(10000);
	  griglia.add(lPrimi, 0, 3, 5, 1);
	  lPrimi.setMaxWidth(10000);
	  
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcolaPrimi.setOnAction(e -> calcolaprimi());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle(" Divisori ");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcolaprimi(){
	   
	   int valore = Integer.parseInt(tNumero.getText());
	   int contatore=0;
	   
	   for(int n = 1; n <valore ;n++){
		   if ((valore % n)==0) {
			  contatore++;
			   lPrimi.setText("il numero non è primo");
		   }else {
			   lPrimi.setText("il numero è primo");
		   }
	   }
	   
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}
