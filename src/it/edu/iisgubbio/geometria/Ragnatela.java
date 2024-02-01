package it.edu.iisgubbio.geometria;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Ragnatela extends Application {
	

  public void start(Stage finestra) {
	  
	  Pane quadro = new Pane();
	  int numLinee=10;
	  int posizioneY;
	  int psizioneX;
	  int posizioneX2=200;
	  int posizioneY2=0;
	  
	  
	  for(int y=20; y<=numLinee ;posizioneY=0 ){
		   Line linea = new Line(posizioneX2,);
		   linea.setFill(Color.BLUE);
		   quadro.getChildren().add(linea);
		  
		   }
	 
	  
	  
	  
    Scene scena = new Scene(quadro);

    finestra.setTitle(" Ragnatela ");
    finestra.setScene(scena);
    finestra.show();
  }


  public static void main(String[] args) {
	  
    launch(args);
  }
}
