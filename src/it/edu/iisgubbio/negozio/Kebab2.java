package it.edu.iisgubbio.negozio;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Kebab2 extends Application {
	Label lCarne = new Label("Carne");
	ComboBox <String> comboCarne= new ComboBox<>();
	
	Label lVerdura = new Label("Verdure");
	ComboBox <String> comboVerdura= new ComboBox<>();
	
	Label lSalse = new Label("Salse");
	ComboBox <String> comboSalse= new ComboBox<>();
	
	Button bCalcolaTotale = new Button("totale");
	Label lTotale = new Label();
  public void start(Stage finestra) {
    

	  GridPane griglia = new GridPane();
	  
	  griglia.add(lCarne, 0, 0);
	  griglia.add(comboCarne, 0, 1);
	  
	  griglia.add(lVerdura, 0, 2);
	  griglia.add(comboVerdura, 0, 3);
	  
	  griglia.add(lSalse, 0, 4);
	  griglia.add(comboSalse, 0, 5);
	  
	  griglia.add(bCalcolaTotale, 0, 6);
	  bCalcolaTotale.setMaxWidth(1000);
	  griglia.add(lTotale, 0, 7 );
	  
	 
	  bCalcolaTotale.setOnAction(e -> calcolatotale());
	  
	  comboCarne.getItems().add("pollo");
	  comboCarne.getItems().add("maiale");
	  comboCarne.getItems().add("vitello");
	  comboCarne.getItems().add("tofu");
	  comboCarne.getSelectionModel().select(0);
	  
	  comboVerdura.getItems().add("insalata");
	  comboVerdura.getItems().add("cipolla");
	  comboVerdura.getItems().add("pomodoro");
	  comboVerdura.getItems().add("carota");
	  comboVerdura.getSelectionModel().select(0);
	  
	  comboSalse.getItems().add("maionese");
	  comboSalse.getItems().add("piccante");
	  comboSalse.getItems().add("yogurt");
	  comboSalse.getItems().add("tzatziki");
	  comboSalse.getSelectionModel().select(0);
	  
    Scene scena = new Scene(griglia,  200, 300);

    finestra.setTitle("Kebab2");
    finestra.setScene(scena);
    finestra.show();
  }
  
  private void calcolatotale(){
	  String strCarne = comboCarne.getValue();
	  String strVerdura = comboVerdura.getValue();
	  String strSalse = comboSalse.getValue();
	  double totale=0;
	  switch (strCarne) {
	  case "pollo":
		  totale = totale + 3.00;
		  break;
	  case "maiale":
		  totale = totale + 2.50;
		  break;
	  case "vitello":
		  totale = totale + 4.00;
		  break;
	   default:
		  totale = totale + 3.00;
		  break;
	  }
	  switch (strVerdura) {
	  case "insalata":
		  totale = totale + 0.50;
		  break;
	  case "cipolla":
		  totale = totale + 0.50;
		  break;
	  case "pomodoro":
		  totale = totale + 1.00;
		  break;
	   default:
		  totale = totale + 1.00;
		  break;
	  }
	  switch (strSalse) {
	  case "maionese":
		  totale = totale + 0.50;
		  break;
	  case "piccante":
		  totale = totale + 1.00;
		  break;
	  case "yogurt":
		  totale = totale + 0.50;
		  break;
	   default:
		  totale = totale + 0.50;
		  break;
	  }
	  totale= 1+(totale);
	  lTotale.setText(totale+"€");
  }
  public static void main(String[] args) {
	  
    launch(args);
  }
}
