package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Pallini extends Application {
	
  public void start(Stage finestra) {
	  
	  Pane quadro = new Pane();
	  
	  
	  
	  for(int n=20; n<=280   ;n+=20){
		   Circle pallino = new Circle(7);
		   pallino.setFill(Color.BLUE);
		   pallino.setCenterX(n);
		   pallino.setCenterY(10);
		   quadro.getChildren().add(pallino);
		  
		   }
	 
	  
	  
	  
    Scene scena = new Scene(quadro);

    finestra.setTitle(" Pallini ");
    finestra.setScene(scena);
    finestra.show();
  }


  public static void main(String[] args) {
	  
    launch(args);
  }
}
