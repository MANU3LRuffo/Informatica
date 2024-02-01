package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Interesse extends Application {
	Label lCapitale = new Label(" capitale iniziale ");
	TextField tCapitale= new TextField();
	Label lInteresse = new Label(" tasso di interesse ");
	TextField tInteresse= new TextField();
	Label lAnni = new Label(" numero di anni ");
	TextField tAnni= new TextField();
	Button bCalcolaInterese = new Button(" calcola interesse ");
	Label lRisultato = new Label();
	
  public void start(Stage finestra) {
	  


	  GridPane griglia = new GridPane();
	  
	  griglia.add(lCapitale, 0, 0);
	  griglia.add(tCapitale, 1, 0);
	  griglia.add(lInteresse, 0, 1);
	  griglia.add(tInteresse, 1, 1);
	  griglia.add(lAnni, 0, 2);
	  griglia.add(tAnni, 1, 2);
	  griglia.add(bCalcolaInterese, 0, 3, 5, 1);
	  bCalcolaInterese.setMaxWidth(10000);
	  griglia.add(lRisultato, 0, 4, 5, 1);
	  lRisultato.setMaxWidth(10000);
	  
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bCalcolaInterese.setOnAction(e -> calcolaCapitale());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle(" Interesse ");
    finestra.setScene(scena);
    finestra.show();
  }

   private void calcolaCapitale(){
	   String stringaCapitale= tCapitale.getText();
	   String stringaAnni= tAnni.getText();
	   String stringaInteresse = tInteresse.getText();
	   
	   double interesse = Double.parseDouble(stringaInteresse);
	   double capitale = Double.parseDouble(stringaCapitale);
	   int anni= Integer.parseInt(stringaAnni);
	   for(int n = 1; n <=anni ;n++){
		   capitale = capitale+(capitale / 100)* interesse;
	   }
	   lRisultato.setText(""+capitale);
  }

  public static void main(String[] args) {
	  
    launch(args);
  }
}

