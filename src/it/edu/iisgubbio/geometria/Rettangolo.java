package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Rettangolo extends Application {
	Label lBase = new Label("base");
	TextField tBase = new TextField();
	Label lAltezza = new Label("altezza");
	TextField tAltezza = new TextField();
	Button bCalcola = new Button("calcola");
	Label lArea = new Label();
	Label lPerimetro = new Label();
	
  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  griglia.add(lBase, 0, 0);
	  griglia.add(tBase, 1, 0);
	  griglia.add(lAltezza, 0, 1);
	  griglia.add(tAltezza, 1, 1);
	  griglia.add(bCalcola, 0, 2, 2, 1);
	  bCalcola.setMaxWidth(1000);
	  griglia.add(lArea, 0, 3);
	  griglia.add(lPerimetro, 1, 3);
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcola.setOnAction(e -> calcola());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle("Rettangolo");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcola(){
	   float base;
	   float altezza;
	   float area;
	   float perimetro;
	  base=Float.parseFloat(tBase.getText());
	  altezza=Float.parseFloat(tAltezza.getText());
	  area= base * altezza;
	  perimetro= (base + altezza)*2;
	  lArea.setText("L'area è " + area);
	  lPerimetro.setText("Il perimetro è " + perimetro);
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}
