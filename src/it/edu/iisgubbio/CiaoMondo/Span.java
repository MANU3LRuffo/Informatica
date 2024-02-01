package it.edu.iisgubbio.CiaoMondo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Span extends Application {
	Button bCiao = new Button("ciao");
	Button bDuecolonne = new Button("2 colonnne");
	Button bA = new Button("A");
	Button bB = new Button("B");
	

  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  
	  griglia.add(bCiao, 0, 0, 1, 2);
	  bCiao.setMaxSize(60,60);
	  griglia.add(bDuecolonne, 1, 0, 2, 1);
	  bDuecolonne.setMaxWidth(200.0);
	  griglia.add(bA, 1, 1);
	  bA.setMaxWidth(1000);
	  griglia.add(bB, 2, 1);
	  bB.setMaxWidth(1000);
	  
    Scene scena = new Scene(griglia,  0, 0);

    finestra.setTitle("Span");
    finestra.setScene(scena);
    finestra.show();
  }
  public static void main(String[] args) {
	  
    launch(args);
  }
}
