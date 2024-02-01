package it.edu.iisgubbio.date;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Bisestile extends Application {
	Label lAnno = new Label("anno");
	TextField tAnno = new TextField();
	Button bBisestile= new Button("calcola");
	Label lBisestile = new Label();
	
  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  griglia.add(lAnno, 0, 0);
	  griglia.add(tAnno, 1, 0);
	  griglia.add(bBisestile, 0, 1);
	  griglia.add(lBisestile, 1, 1);
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bBisestile.setOnAction(e -> calcola());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle("Bisestile");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcola(){
	   String stringaAnno;
	   int anno;
	   
	   stringaAnno = tAnno.getText();
	   anno =Integer.parseInt(stringaAnno);
	   
	   if((anno % 4)==0 && ((anno % 100)!=0 || (anno % 400)==0)) {
		   lBisestile.setText("l' anno è bisestile");
	   } else {
		   lBisestile.setText("l'anno non è bisestile");
	   }
	   
	   
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}
