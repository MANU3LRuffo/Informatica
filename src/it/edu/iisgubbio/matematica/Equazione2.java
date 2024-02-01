package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Equazione2 extends Application {
	TextField tTestoX2 = new TextField();
	Label lTestoX2 = new Label("x^2 +");
	TextField tTestoX= new TextField();
	Label lTestoX = new Label("x +");
	TextField tTermineNoto= new TextField();
	Label lTermineNoto = new Label("= 0 ");
	Button bCalcola = new Button("calcola la soluzione");
	Label lSoluzione = new Label();
	
  public void start(Stage finestra) {
	  
	    Image immagineMatematica= new Image (getClass().getResourceAsStream("matematica.png"));
	  ImageView visualizzatoreImmagineMatematica = new ImageView  (immagineMatematica);
	  visualizzatoreImmagineMatematica.setFitHeight(40);
	  visualizzatoreImmagineMatematica.setPreserveRatio(true);
	  bCalcola.setGraphic(visualizzatoreImmagineMatematica);

	  GridPane griglia = new GridPane();
	  
	  griglia.add(tTestoX2, 0, 0);
	  griglia.add(lTestoX2, 1, 0);
	  griglia.add(tTestoX, 2, 0);
	  griglia.add(lTestoX, 3, 0);
	  griglia.add(tTermineNoto, 4, 0);
	  griglia.add(lTermineNoto, 5, 0);
	  griglia.add(bCalcola, 0, 1, 5, 1);
	  bCalcola.setMaxWidth(10000);
	  griglia.add(lSoluzione, 0, 2);
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcola.setOnAction(e -> calcola());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle("Equazione secondo grado");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcola(){
	  String stringaA;
	  String stringaB;
	  String stringaC;
	  
	  double a;
	  double b;
	  double c;
	  double delta;
	  double x1;
	  double x2;
	  
	  stringaA = tTestoX2.getText();
	  stringaB = tTestoX.getText();
	  stringaC = tTermineNoto.getText();
	   
	  
	  a = Double.parseDouble(stringaA);
	  b = Double.parseDouble(stringaB);
	  c = Double.parseDouble(stringaC);
	  delta = b*b - (4*a*c);
	  x1 = (-b + Math.sqrt(delta))/(2*a);
	  x2 = (-b - Math.sqrt(delta))/(2*a);
			  
	  if (delta>0) {
		  
		 lSoluzione.setText("la soluzione è" +x1  +x2);
	  }else {
		  if (delta<0) {
			  lSoluzione.setText("la soluzione non esiste");
		  } else{
			  if(delta==0) {
				  lSoluzione.setText("la soluzione è impossibile");
			  }
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}

