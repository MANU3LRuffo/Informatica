package it.edu.iisgubbio.negozio;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NewLook extends Application {
	Label lKmPercorsi = new Label("Km percorsi");
	TextField tKmPercorsi = new TextField();
	
	Label lModalità = new Label(" Modalità ");
	Label lEquipaggiamento = new Label(" Equipaggiamento ");
	
	
	RadioButton spuntaNuoto = new RadioButton (" nuoto ");
	RadioButton spuntaCorsa = new RadioButton (" corsa ");
	RadioButton spuntaBici = new RadioButton (" bici ");
	CheckBox spuntaBracciali = new CheckBox (" bracciali ");
	CheckBox spuntaCavigliere = new CheckBox (" cavigliere ");
	
	Button bCalcola = new Button("calcola");
	Label lCalorie = new Label();
	
  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	 
	  griglia.add(lKmPercorsi, 0, 0);
	  
	  griglia.add(tKmPercorsi, 1, 0);
	  
	  griglia.add(lModalità, 0, 1);
	  
	  griglia.add(lEquipaggiamento, 1, 1);
	  
	  griglia.add(spuntaNuoto, 0, 3);
	  
	  griglia.add(spuntaCorsa, 0, 4);
	  
	  griglia.add(spuntaBici, 0, 5);
	  
	  griglia.add(spuntaBracciali, 1, 2);
	  
	  griglia.add(spuntaCavigliere, 1, 3);
	  
	  griglia.add(bCalcola, 0, 5);
	  bCalcola.setMaxWidth(1000);
	  
	  griglia.add(lCalorie, 1, 5);
	  
	  
	  bCalcola.setOnAction(e -> calcolatotale());
	  
	  spuntaNuoto.setSelected(true);
	  spuntaBici.setSelected(true);
	  spuntaCorsa.setSelected(true);
	  
    Scene scena = new Scene(griglia,  0, 0);

    finestra.setTitle("New Look");
    finestra.setScene(scena);
    finestra.show();
  }
  
  private void calcolatotale(){
	  
	  double kilometri= Double.parseDouble(tKmPercorsi.getText());
	  double totale=0;
	  
	  if(spuntaNuoto.isSelected()) {
		  
		  totale= kilometri*21;
		  
	  } else if(spuntaBici.isSelected()) {
		  
		  totale= kilometri*12;
		  
	  } else if(spuntaCorsa.isSelected()) {
		  
		  totale= kilometri*7;
		  
	  }
	  if(spuntaBracciali.isSelected()) {
		  
	  } else if(spuntaCavigliere.isSelected()) {
		  
	  }
	  
  }
  public static void main(String[] args) {
	  
    launch(args);
  }
}
