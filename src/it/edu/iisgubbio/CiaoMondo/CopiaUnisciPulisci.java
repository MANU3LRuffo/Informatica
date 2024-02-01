package it.edu.iisgubbio.CiaoMondo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CopiaUnisciPulisci extends Application {
	TextField tTestoSx = new TextField();
	Button beseguiCopiaSx = new Button();
	Label lCopiaSx = new Label();
	Button beseguiUnisci = new Button();
	Label lUnisci = new Label();
	Button beseguiPulisci = new Button();
	TextField tTestoDx = new TextField();
	Button beseguiCopiaDx = new Button();
	Label lCopiaDx = new Label();

  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  beseguiCopiaSx.setText("Copia");
	  beseguiUnisci.setText("Unisci");
	  beseguiPulisci.setText("Pulisci");
	  beseguiCopiaDx.setText("Copia");
	  
	  
	  griglia.add(tTestoSx, 0, 0);
	  griglia.add(beseguiCopiaSx, 0, 2);
	  griglia.add(lCopiaSx, 0, 3);
	  griglia.add(beseguiUnisci, 1, 0);
	  griglia.add(lUnisci, 1, 2);
	  griglia.add(beseguiPulisci, 1, 3);
	  griglia.add(tTestoDx, 2, 0);
	  griglia.add(beseguiCopiaDx, 2, 2);
	  griglia.add(lCopiaDx, 2, 3);
	  
	  beseguiCopiaSx.setOnAction(e -> copiaSx());
	    beseguiUnisci.setOnAction(e -> unisci());
	    beseguiPulisci.setOnAction(e -> pulisci());
	    beseguiCopiaDx.setOnAction(e -> copiaDx());
	  
    Scene scena = new Scene(griglia,  0, 0);

    finestra.setTitle("CopiaUnisciPulisci");
    finestra.setScene(scena);
    finestra.show();
  }

  private void unisci(){
	   lUnisci.setText(tTestoSx.getText() + tTestoDx.getText());
  }
  
  private void copiaSx(){
	   lCopiaSx.setText(tTestoSx.getText());
  }
 
  private void copiaDx(){
	   lCopiaDx.setText(tTestoDx.getText());
  }
 
  private void pulisci(){
	   tTestoDx.setText("");
	   tTestoSx.setText("");
	   lUnisci.setText("");
	   lCopiaSx.setText("");
	   lCopiaDx.setText("");
  }
  public static void main(String[] args) {
	  
    launch(args);
  }
}
