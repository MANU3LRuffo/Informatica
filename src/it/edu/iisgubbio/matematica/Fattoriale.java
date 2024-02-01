package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Fattoriale extends Application {
	TextField tFattoriale= new TextField();
	Button bCalcolaFattoriale = new Button(" divisori ");
	Label lFattoriale = new Label();
	
  public void start(Stage finestra) {
	  


	  GridPane griglia = new GridPane();

	  griglia.add(tFattoriale, 0, 0);
	  griglia.add(bCalcolaFattoriale, 1, 0);
	  griglia.add(lFattoriale, 2, 0);
	  
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcolaFattoriale.setOnAction(e -> calcolafattoriale());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle(" Fattoriale ");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcolafattoriale(){
	   
	   int valore = Integer.parseInt(tFattoriale.getText());
	   int fattoriale=1;
	   
	   for(int contatore= 1;  contatore<=valore ;contatore++){
		   fattoriale= fattoriale * contatore;
		   }
	   lFattoriale.setText(""+fattoriale);
	   }

  public static void main(String[] args) {
	  
    launch(args);
  }
}
