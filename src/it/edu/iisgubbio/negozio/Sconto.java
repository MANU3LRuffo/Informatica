package it.edu.iisgubbio.negozio;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Sconto extends Application {
	Label lPrezzoPanino = new Label("prezzo panino");
	TextField tPrezzoPanino = new TextField();
	Label lNumeroPanini= new Label("numero panini");
	TextField tNumeroPanini = new TextField();
	Label lPercentualeSconto= new Label("sconto %");
	TextField tPercentualeSconto = new TextField();
	Button bCalcolaTotale = new Button("calcola totale");
	Label lTotale = new Label();
	CheckBox spunta = new CheckBox("spunta per lo sconto");
  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	 
	  griglia.add(lPrezzoPanino, 0, 0);
	  griglia.add(tPrezzoPanino, 1, 0);
	  griglia.add(lNumeroPanini, 0, 1);
	  griglia.add(tNumeroPanini, 1, 1);
	  griglia.add(lPercentualeSconto, 0, 2);
	  griglia.add(tPercentualeSconto, 1, 2);
	  griglia.add(bCalcolaTotale, 1, 3, 2, 1);
	  bCalcolaTotale.setMaxWidth(1000);
	  griglia.add(lTotale, 0, 4);
	  griglia.add(spunta, 0, 3); 
	  
	  bCalcolaTotale.setOnAction(e -> calcolatotale());
	  
    Scene scena = new Scene(griglia,  300, 200);

    finestra.setTitle("Sconto");
    finestra.setScene(scena);
    finestra.show();
  }
  
  private void calcolatotale(){
	   String stringaprezzoPanino;
	   String stringaNumeroPanini;
	   String stringaSconto;
	   
	   double prezzoPanino;
	   double numeroPanini;
	   double percentualeSconto;
	   
	   stringaprezzoPanino = tPrezzoPanino.getText();
	   stringaNumeroPanini = tNumeroPanini.getText();
	   stringaSconto = tPercentualeSconto.getText();
	   
	   prezzoPanino =Double.parseDouble(stringaprezzoPanino);
	   numeroPanini = Double.parseDouble(stringaNumeroPanini);
	   percentualeSconto = Double.parseDouble(stringaSconto);
	   
	   double totale = prezzoPanino * numeroPanini;
	   double sconto= totale * percentualeSconto/100;
	   totale = totale - sconto;
	   lTotale.setText("il totale è " +totale);
	   
	   
	   
	   
	   
	   
  }
  public static void main(String[] args) {
	  
    launch(args);
  }
}