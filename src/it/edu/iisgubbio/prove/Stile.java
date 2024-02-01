package it.edu.iisgubbio.prove;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Stile extends Application {
	Label lBase = new Label("lato");
	TextField tBase = new TextField();
	Label lAltezza = new Label("lato");
	TextField tAltezza = new TextField();
	Label lArea = new Label(" area ");
	Label lPerimetro = new Label(" perimetro ");
	
	
  public void start(Stage finestra) {
    

	  lPerimetro.getStyleClass().add("perimetro");
	  GridPane griglia = new GridPane();
	  
	  griglia.getStyleClass().add("griglia");
	  
	  griglia.add(lBase, 0, 0);
	  griglia.add(tBase, 1, 0);
	  griglia.add(lAltezza, 0, 1);
	  griglia.add(tAltezza, 1, 1);
	  griglia.add(lArea, 0, 2);
	  griglia.add(lPerimetro, 1, 2);
	  
	  
	  tBase.setOnAction(e -> calcola());
	  
    Scene scena = new Scene(griglia);
    
    scena.getStylesheets().add("it/edu/iisgubbio/prove/Stile.css");
    
    finestra.setTitle(" CSS ");
    finestra.setScene(scena);
    finestra.show();
  }
  private void calcola {
	  double base=0;
	  double altezza;
	  double area;
	  
	  
	  
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}
