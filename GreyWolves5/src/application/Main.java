package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.ControllerGreyWolvesHome;


public class Main extends Application {
    
	  private Stage primaryStage;

	public void start(Stage primaryStage) {
	    	this.primaryStage = primaryStage;
	    	greyWolvesHome();
	          
	    }
  
    private ControllerGreyWolvesHome controller;
    
    public void greyWolvesHome(){
        try {
           FXMLLoader loader = new FXMLLoader(Main.class.getClassLoader().getResource("view/GreyWolvesHome.fxml"));
			AnchorPane pane = loader.load();
           

			primaryStage.setMinHeight(500.00);
		      primaryStage.setMinWidth(1000.00);
		
			       Scene scene = new Scene(pane);  


			           primaryStage.setTitle("Grey Wolves Home");
			            primaryStage.setScene(scene);
			            primaryStage.show();


	            ControllerGreyWolvesHome controller = loader.getController();
	            controller.setMain(this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
