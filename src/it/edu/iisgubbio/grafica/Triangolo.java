package it.edu.iisgubbio.grafica;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class Triangolo extends Application {
	
	Label lNumero = new Label(" numero ");
	TextField tTestoNumero = new TextField();
	Button bPartire = new Button(" vaiii!! ");
	 Pane quadro= new Pane();
 public void start(Stage finestra) {
	 
	 GridPane griglia = new GridPane();
	 
	 
	 griglia.add(lNumero, 0, 0);
	 griglia.add(tTestoNumero, 1, 0);
	 griglia.add(bPartire, 2, 0);
	 griglia.add(quadro, 0, 1, 3, 1);
	 
	 
    Scene scena = new Scene(griglia, 300, 200);

    finestra.setTitle(" Triangolo Pallini ");
    finestra.setScene(scena);
    finestra.show();
    bPartire.setOnAction(e -> faipartire());
  }

 
 private void faipartire(){
	 quadro.getChildren().clear();
	 int base= Integer.parseInt(tTestoNumero.getText());
	 int numeroMax= base*20;
	 for(int x=20; x<=(numeroMax)  ;x+=20){
		 for(int y=20; y<=(base*20); y+=20) {
			 
			 Circle pallino = new Circle(7);
			   
			   pallino.setFill(Color.BLUE);
			   quadro.getChildren().add(pallino);
			   pallino.setCenterX(x);
			   pallino.setCenterY(10);
			   }
		 numeroMax-=20;
		 }	   
 	}
	   						


  public static void main(String[] args) {
	  
    launch(args);
  }
}
