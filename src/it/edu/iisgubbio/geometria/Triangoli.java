package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Triangoli extends Application {
	TextField tLato1 = new TextField();
	TextField tLato2 = new TextField();
	TextField tLato3 = new TextField();
	Button bTipo = new Button("trova tipo");
	Label lTipo = new Label();

  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  griglia.add(tLato1, 0, 0);
	  griglia.add(tLato2, 1, 0);
	  griglia.add(tLato3, 2, 0);
	  griglia.add(bTipo, 0, 1, 2, 3);
	  bTipo.setMaxWidth(1000);
	  griglia.add(lTipo, 0, 4);
	  
	  bTipo.setOnAction(e -> trovatipo());
	  
    Scene scena = new Scene(griglia,  0, 0);

    finestra.setTitle("Triangoli");
    finestra.setScene(scena);
    finestra.show();
  }

   private void trovatipo(){
	  String stringLato1;
	  String stringaLato2;
	  String stringaLato3;
	  
	  double lato1;
	  double lato2;
	  double lato3;
	  
	  stringLato1 = tLato1.getText();
	  stringaLato2 = tLato2.getText();
	  stringaLato3 = tLato3.getText();
	  
	  lato1 = Double.parseDouble(stringLato1);
	  lato2 = Double.parseDouble(stringaLato2);
	  lato3 = Double.parseDouble(stringaLato3);
	  
	  if (lato1==lato2 && lato2==lato3) {
	   lTipo.setText(" il triangolo è equilatero");
	  } else if ((lato3*lato3)!=(lato1*lato1)+(lato2*lato2)) {
		  lTipo.setText(" il triangolo è rettangolo");
	  } else if ((lato1==lato2 && lato1!=lato3)||(lato1==lato3 && lato1!=lato2)) {
		  lTipo.setText(" il triangolo è isoscele");
	  } else {
		  lTipo.setText("il triangolo è scaleno");
	  }
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}
