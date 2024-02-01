package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Quadrato extends Application {
	Label lLato = new Label("lato");
	TextField tLato = new TextField();
	Button bArea = new Button("area");
	Label lArea = new Label();

  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  griglia.add(lLato, 0, 0);
	  griglia.add(tLato, 1, 0);
	  griglia.add(bArea, 0, 2);
	  griglia.add(lArea, 1, 2);
	  
	  bArea.setOnAction(e -> moltiplica());
	  
    Scene scena = new Scene(griglia,  200, 100);

    finestra.setTitle("Quadrato");
    finestra.setScene(scena);
    finestra.show();
  }

   private void moltiplica(){
	  String latoStringa;
	  int lato;
	  int area;
	  latoStringa = tLato.getText();
	  
	  lato = Integer.parseInt(latoStringa);
	  area = lato * lato;
	   lArea.setText(""+area);
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}
