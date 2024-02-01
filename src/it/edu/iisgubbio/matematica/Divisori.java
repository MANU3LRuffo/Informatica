package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Divisori extends Application {
	Label lNumero = new Label(" numero ");
	TextField tNumero= new TextField();
	Button bCalcolaDivisori = new Button(" divisori ");
	Label lDivisori = new Label();
	
  public void start(Stage finestra) {
	  


	  GridPane griglia = new GridPane();
	  
	  griglia.add(lNumero, 0, 0);
	  griglia.add(tNumero, 1, 0);
	  griglia.add(bCalcolaDivisori, 0, 2, 5, 1);
	  bCalcolaDivisori.setMaxWidth(10000);
	  griglia.add(lDivisori, 0, 3, 5, 1);
	  lDivisori.setMaxWidth(10000);
	  
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcolaDivisori.setOnAction(e -> divisori());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle(" Divisori ");
    finestra.setScene(scena);
    finestra.show();
  }

   private void divisori(){
	   
	   String stringaDivisore= "";
	   
	   int valore = Integer.parseInt(tNumero.getText());
	   for(int n = 2; n <valore ;n++){
		   if((valore%n)==0) {
			   if(stringaDivisore.equals("")) {
				   stringaDivisore+= ""+n;
			   }else {
				   stringaDivisore=stringaDivisore+", "+n;
			   }  
			
		   }
	   }
	   lDivisori.setText(stringaDivisore);
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}

