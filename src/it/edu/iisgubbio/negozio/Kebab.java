package it.edu.iisgubbio.negozio;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Kebab extends Application {
	CheckBox spuntaCarne = new CheckBox(" carne   [4,00 €]");
	CheckBox spuntaFormaggio = new CheckBox(" formaggio   [1,00 €]");
	CheckBox spuntaPomodoro = new CheckBox(" pomodoro   [1,00 €]");
	CheckBox spuntaSalsa = new CheckBox(" salsa   [0,50 €]");
	CheckBox spuntaCipolla = new CheckBox(" cipolla   [0,50 €]");
	Button bCalcolaTotale = new Button("totale");
	Label lTotale = new Label();
  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	 
	  griglia.add(spuntaCarne, 0, 0);
	  griglia.add(spuntaFormaggio, 0, 1);
	  griglia.add(spuntaPomodoro, 0, 2);
	  griglia.add(spuntaSalsa, 0, 3);
	  griglia.add(spuntaCipolla, 0, 4);
	  griglia.add(bCalcolaTotale, 0, 10);
	  bCalcolaTotale.setMaxWidth(1000);
	  griglia.add(lTotale, 1, 10);
	  
	  bCalcolaTotale.setOnAction(e -> calcolatotale());
	  
    Scene scena = new Scene(griglia,  0, 0);

    finestra.setTitle("Kebab");
    finestra.setScene(scena);
    finestra.show();
  }
  
  private void calcolatotale(){
	  double totale=0;
	  if ( spuntaCarne.isSelected() ) {
		  totale=totale+4;
	  } if (spuntaFormaggio.isSelected() ) {
		  totale=totale+1;
	  } if (spuntaPomodoro.isSelected() ) {
		  totale=totale+1;
	  } if(spuntaSalsa.isSelected() ) {
		  totale=totale+0.50;
	  } if(spuntaCipolla.isSelected() ) {
		  totale=totale+0.50;
	  }
	  lTotale.setText("il totale è " +totale);
  }
  public static void main(String[] args) {
	  
    launch(args);
  }
}
