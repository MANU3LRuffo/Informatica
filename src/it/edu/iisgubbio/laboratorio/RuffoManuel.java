package it.edu.iisgubbio.laboratorio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class RuffoManuel extends Application {
	Label lValoreN = new Label(" valore N");
	TextField tValoreN= new TextField();
	Label lValoreM = new Label(" valore M");
	TextField tValoreM= new TextField();
	Button bSommaNumeri = new Button(" somma ");
	Button bCalcolaPrimi = new Button(" primi ");
	Button bCalcolaDisp = new Button(" disposizioni semplici ");
	Label lSomma = new Label();
	Label lPrimi = new Label();
	Label lDisposiz1 = new Label();
	Label lDisposiz2 = new Label();
	
  public void start(Stage finestra) {
	  


	  GridPane griglia = new GridPane();
	  
	  griglia.add(lValoreN, 0, 0);
	  griglia.add(tValoreN, 1, 0);
	  griglia.add(lValoreM, 0, 1);
	  griglia.add(tValoreM, 1, 1);
	  griglia.add(bSommaNumeri, 0, 2);
	  griglia.add(lSomma, 1, 2);
	  griglia.add(bCalcolaPrimi, 0, 3);
	  griglia.add(lPrimi, 1, 3);
	  griglia.add(bCalcolaDisp, 0, 4);
	  griglia.add(lDisposiz1, 1, 4);
	  griglia.add(lDisposiz2, 2, 4);
	  
	  
	  griglia.setHgap(10);
	  griglia.setVgap(10);
	  griglia.setPadding(new Insets(10,10,10,10));
	  
	  bSommaNumeri.setOnAction(e -> sommanumeri());
	  bCalcolaPrimi.setOnAction(e -> primi());
	  bCalcolaDisp.setOnAction(e -> disposizioni());
	  
    Scene scena = new Scene(griglia);

    finestra.setTitle(" RuffoManuel ");
    finestra.setScene(scena);
    finestra.show();
  }
  private void sommanumeri(){
	   
	   int valoreN = Integer.parseInt(tValoreN.getText());
	   int valoreM = Integer.parseInt(tValoreM.getText());
	   int sommaNumeri=0;
	   for(int contatore=1; contatore==1; contatore++) {
		   if(valoreN>0&&valoreM>0) {
			   contatore+=1;
			   sommaNumeri= (valoreN+valoreM)+6;
		   }
		   lSomma.setText(""+sommaNumeri);
	   }
  }
  private void primi(){
	   
	   int valoreeM = Integer.parseInt(tValoreM.getText());
	   int valoreeN = Integer.parseInt(tValoreN.getText());
	   int contatore=0;
	   
	   for(int n = 1; n <valoreeM ;n++){
		   if ((valoreeM % n)==0) {
			  contatore++;
			   lPrimi.setText("il numero non è primo");
		   }else if ((valoreeN % n)==0){
			   contatore++;
		   }{
			   lPrimi.setText("il numero è primo");
		   }
	   }
	   
  }

  private void disposizioni(){
	   
	  int numeroN = Integer.parseInt(tValoreN.getText());
	  int numeroM = Integer.parseInt(tValoreM.getText());
	   double fattorialeN=1;
	   double fattorialeM=1;
	   int contatore=1;
	   int numeroD= numeroN /(numeroN - numeroM);
	   if(contatore<=numeroN) {
		   contatore++;
		   fattorialeN= fattorialeN * contatore;
		   numeroD= numeroN /(numeroN - numeroM);
	   }else if(contatore<=numeroM) {
		   contatore++;
		   fattorialeM= fattorialeM * contatore;
		   numeroD= numeroN /(numeroN - numeroM);
	   }
 lDisposiz1.setText(""+fattorialeN);
 lDisposiz2.setText(""+fattorialeM);
	}
  
  public static void main(String[] args) {
	  
    launch(args);
  }
}
