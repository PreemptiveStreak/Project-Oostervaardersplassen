/**
 * 
 */
package view;

import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

/**
 * @author stetc
 *
 */
public class ControllerGreyWolvesHome {
	@FXML  
	private MenuItem close;
	@FXML  
	private Menu about;
	@FXML  
	private AreaChart<?, ?> predictionGraph;
	@FXML  
	private Button predict;
	@FXML  
	private Button newPrediction;
	@FXML  
	private TextField wolves;
	@FXML  
	private TextField cow;
	@FXML  
	private  TextField horse;
	@FXML  
	private TextField deer;
	@FXML  
	private TextField BirthRateDeer;
	@FXML
	private NumberAxis xAxis = new NumberAxis();
	  
	
	public void close() {
		System.exit(0);
	}
}
