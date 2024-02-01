package it.edu.iisgubbio.TPSIT;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AreaCerchio extends Application {

	TextField cRaggio = new TextField();
	Label eArea = new Label();

	public void start(Stage finestra) throws Exception {
	
		GridPane griglia = new GridPane();
		Button pCalcolaA = new Button("calcola area");
		Button pCalcolaC = new Button("calcola circonferenza");
		Label eRaggio = new Label("raggio");
		
		griglia.setGridLinesVisible(false);
		
		griglia.add(eRaggio, 0, 0);
		griglia.add(cRaggio, 1, 0);
		griglia.add(pCalcolaA, 0, 2);
		griglia.add(pCalcolaC, 1, 2);
		griglia.add(eArea, 0, 3);
		cRaggio.setPromptText("inserisci valore");
		
		pCalcolaA.setMaxWidth(300);
		eArea.setMinWidth(120);
	    pCalcolaA.setOnAction(e -> area());
	    pCalcolaC.setOnAction(e -> circonferenza());
		
		griglia.setPadding( new Insets(10,10,10,10));
		griglia.setHgap(5);
		griglia.setVgap(5);
		
		Scene scena = new Scene (griglia);
		finestra.setTitle("Rombo");
		finestra.setScene(scena);
		finestra.show();
		
	}
	public void circonferenza() {
		  double raggio, circonferenza ;
		  raggio = Double.parseDouble(cRaggio.getText());
		 circonferenza=(2*raggio)*3.14;
		 eArea.setText("" + circonferenza);
	  }
	public void area() {
		  double raggio, area ;
		  raggio = Double.parseDouble(cRaggio.getText());
		 area=(raggio*raggio)*3.14;
		 eArea.setText("" + area);
	  }
	public static void main(String[] args) {
		launch(args);
	}
}