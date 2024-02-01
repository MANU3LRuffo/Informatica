package it.edu.iisgubbio.grafica;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class PalliniColonna extends Application {
	
  public void start(Stage finestra) {
	  
	  Pane quadro = new Pane();
	  
	  
	  
	  for(int x=20; x<=100   ;x+=20) {
		  for(int y=20; y<=100; y+=20) {
			Circle pallino = new Circle(7);
		   pallino.setFill(Color.BLUE);
		   pallino.setCenterX(x);
		   pallino.setCenterY(y);
		   quadro.getChildren().add(pallino);   
		  }
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
