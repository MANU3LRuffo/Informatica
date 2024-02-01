package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;




public class RimbalzoPallina extends Application {
	Button bRiprova = new Button("RIPROVA");
	Label tPunteggio1= new Label("0");
	Label tPunteggio2= new Label("0");
	final int LARGHEZZA_AREA_GIOCO=500;
	final int ALTEZZA_AREA_GIOCO = 300;
	final int LARGHEZZA_STECCHETTA= 5;
	final int ALTEZZA_STECCHETTA= 60;
	Rectangle stecchetta1= new  Rectangle(LARGHEZZA_STECCHETTA, ALTEZZA_STECCHETTA);
	Rectangle stecchetta2= new  Rectangle(LARGHEZZA_STECCHETTA, ALTEZZA_STECCHETTA);
	int x=LARGHEZZA_AREA_GIOCO/2;
	int y=ALTEZZA_AREA_GIOCO/2;
	int p1=0;
	int p2=0;
	
	
	boolean destra=true;
	boolean sotto=true;
	Circle palla = new Circle(12);
	
	
	Timeline timeline = new Timeline(new KeyFrame( 
			Duration.millis(10),
			x -> aggiornaTimer()));
	
	
	public void start(Stage finestra) {
		
		Pane quadro= new Pane();
		 quadro.setId("quadro");
		 
		quadro.getChildren().add(stecchetta1);
		quadro.getChildren().add(stecchetta2);
		quadro.setPrefSize(LARGHEZZA_AREA_GIOCO, ALTEZZA_AREA_GIOCO );
		
		GridPane griglia = new GridPane();
		//griglia.add(bRiprova, 2, 0);
		griglia.add(tPunteggio1, 0, 0);
		griglia.add(tPunteggio2, 2, 0);
		griglia.add(quadro, 1, 1, 1, 1);
		stecchetta1.setX(10);
		stecchetta1.setY(100);
		stecchetta2.setX(LARGHEZZA_AREA_GIOCO - 10 - LARGHEZZA_STECCHETTA);
		stecchetta2.setY(100);
		
		griglia.setAlignment(Pos.CENTER);
		
		Scene scena = new Scene(griglia,600,400);

		finestra.setTitle(" Rimbalzo Pallina ");
		finestra.setScene(scena);
		finestra.show();
		
		scena.getStylesheets().add("it/edu/iisgubbio/animazioni/RimbalzoPallina.css");
		
		timeline.setCycleCount(timeline.INDEFINITE);
		palla.setFill(Color.WHITE);
		stecchetta1.setFill(Color.WHITE);
		stecchetta2.setFill(Color.WHITE);
		quadro.getChildren().add(palla);
		timeline.play();
		
		bRiprova.setOnAction(e -> riprova());
		scena.setOnKeyPressed(e -> pigiato(e));
		
	}
	
	private void riprova() {
		timeline.play();
		timeline.stop();
	}

	private void aggiornaTimer(){
		Bounds rimbalzoStecchetta1= stecchetta1.getBoundsInParent();
		Bounds rimbalzoStecchetta2= stecchetta2.getBoundsInParent();
		Bounds rimbalzoPallina= palla.getBoundsInParent();
		
		if(x>=LARGHEZZA_AREA_GIOCO) {
			p1++;
			tPunteggio1.setText(""+p1);
			destra=false;
		}
		if(x<=0) {
			p2++;
			tPunteggio2.setText(""+p2);
			destra=true;
		} 
		
		if(rimbalzoStecchetta1.intersects(rimbalzoPallina)) {
			destra=true;
		} 
		if(destra==true) {
			x+=1;
			palla.setCenterX(x);
		} else  { 
			x-=1;
			palla.setCenterX(x);
		}
		if(stecchetta2.intersects(rimbalzoPallina)) {
			destra=false;
		}
		
		
		
		if(y>=ALTEZZA_AREA_GIOCO) {
			sotto=false;
		} 
		if(y<=0) {
			sotto=true;
		} 
		if(sotto==true) {
			y+=1;
			palla.setCenterY(y);
		} else  {
			y-=1;
			palla.setCenterY(y);
		}
		
		
	}
	private void pigiato(KeyEvent evento) {
		
			
		
		if(stecchetta1.getY()>=0) {
			if(evento.getText().equals ("w")|| evento.getText().equals ("W")){
				stecchetta1.setY(stecchetta1.getY() -4);
			}
		}
		if(stecchetta1.getY()<ALTEZZA_AREA_GIOCO - ALTEZZA_STECCHETTA) {
			if(evento.getText().equals ("s")|| evento.getText().equals("S")){
				stecchetta1.setY(stecchetta1.getY() +4);
			}
		}
		if(stecchetta2.getY()>=0) {
			if(evento.getCode()== KeyCode.UP ) {
				stecchetta2.setY(stecchetta2.getY() -4);
			}
		}
		
		if(stecchetta2.getY()<ALTEZZA_AREA_GIOCO - ALTEZZA_STECCHETTA) {
			if(evento.getCode()==KeyCode.DOWN) {
				stecchetta2.setY(stecchetta2.getY() +4);
			}
		}
	}
	
		public static void main(String[] args) {

		launch(args);
	}
}
