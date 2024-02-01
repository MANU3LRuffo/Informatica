package it.edu.iisgubbio.grafica;




import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class Faccia extends Application {
	
  public void start(Stage finestra) {
	  
	  Pane quadro = new Pane();
	  
	  Circle faccia= new Circle(100);
	  
	  faccia.setFill(Color.PINK);
	  faccia.setCenterX(140);
	  faccia.setCenterY(100);
	  Circle occhioSx = new Circle(5);
	  occhioSx.setFill(Color.BLUE);
	  occhioSx.
	  Circle occhioDx = new Circle(5);
	  
	  
    Scene scena = new Scene(quadro);

    finestra.setTitle(" Faccia ");
    finestra.setScene(scena);
    finestra.show();
  }


  public static void main(String[] args) {
	  
    launch(args);
  }
}
