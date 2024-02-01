package it.edu.iisgubbio.CiaoMondo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * La mia prima classe
 * @param <Label>
 */
public class SalutaUtente extends Application {
	Label lmessaggio = new Label();
	TextField tnome = new TextField();
	Label lmettiNome = new Label();
	Button beseguiSaluto = new Button();


  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  griglia.add(lmettiNome, 0, 0);
	  griglia.add(tnome, 1, 0);
	  griglia.add(beseguiSaluto, 1, 1);
	  griglia.add(lmessaggio, 1, 2);
	  
	  lmettiNome.setText("Nome:");
	  lmessaggio.setText("Sono impaziente...");
	  beseguiSaluto.setText("Premi qui");
	  
    Scene scena = new Scene(griglia, 300, 250);

    finestra.setTitle("SalutaUtente");
    finestra.setScene(scena);
    finestra.show();
    beseguiSaluto.setOnAction(e -> esegui());
  }

  private void esegui(){
	  String utente;
	   utente = tnome.getText();
	   lmessaggio.setText("Signor " + utente + " Le auguro buona giornata!");
  }
  

  public static void main(String[] args) {
	  
    launch(args);
  }
}