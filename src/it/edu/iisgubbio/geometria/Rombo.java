package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Rombo extends Application {
	Label lDiagonale1 = new Label("diagonale 1");
	TextField tDiagonale1 = new TextField();
	Label lDiagonale2 = new Label("diagonale 2");
	TextField tDiagonale2= new TextField();
	Button bCalcola = new Button("calcola l'area e il perimetro");
	Label lArea = new Label();
	Label lPerimetro = new Label();
	
  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  griglia.add(lDiagonale1, 0, 0);
	  griglia.add(tDiagonale1, 1, 0);
	  griglia.add(lDiagonale2, 0, 1);
	  griglia.add(tDiagonale2, 1, 1);
	  griglia.add(bCalcola, 0, 2, 2, 1);
	  bCalcola.setMaxWidth(1000);
	  griglia.add(lArea, 0, 3);
	  griglia.add(lPerimetro, 0, 4);
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcola.setOnAction(e -> calcola());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle("Rombo");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcola(){
	   float diagonale1;
	   float diagonale2;
	   float cateto1;
	   float cateto2;
	   double lato;
	   double perimetro;
	   float area;
	  diagonale1=Float.parseFloat(tDiagonale1.getText());
	  diagonale2=Float.parseFloat(tDiagonale2.getText());
	  cateto1= diagonale1 / 2;
	  cateto2= diagonale2 / 2;
	  area= (diagonale1 * diagonale2) /2;
	  lato= Math.sqrt(cateto1 * cateto1+ cateto2 * cateto2);
	  perimetro= lato * 4;
	  lArea.setText("L'area è " + area);
	  lPerimetro.setText("il perimetro è " + perimetro);
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}

