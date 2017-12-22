/**
 * 
 */
package view;

import application.Main;
import domain.CattleCalculator;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author stetc
 *
 */
public class ControllerGreyWolvesHome {
	
	public Main main;
	
	public void setMain(Main main){
		this.main = main;
		
	}
	
	@FXML
	private TextField wolves;
	@FXML
	private TextField NameSpecie1;
	@FXML
	private TextField AmountSpecie1;
	@FXML
	private TextField BirthRate1;
	@FXML
	private TextField DeathRate1;
	@FXML
	private TextField NameSpecie2;
	@FXML
	private TextField AmountSpecie2;
	@FXML
	private TextField BirthRate2;
	@FXML
	private TextField DeathRate2;
	@FXML
	private TextField CarryingCapacity1;	
	@SuppressWarnings("rawtypes")
	@FXML
	private LineChart linechart;
	@FXML
	private Button predictCompetition;
	@FXML
	private Button newPrediction;
	@FXML
	private NumberAxis xAxis;
	@FXML
	private NumberAxis yAxis;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@FXML
	public void predictCompetition(){
		
		// Get the values from the text boxes
	//	int numberOfWolves = Integer.parseInt(wolves.getText());
		float birth1 = Float.parseFloat(BirthRate1.getText());
		float death1 = Float.parseFloat(DeathRate1.getText());
		float amount1 = Integer.parseInt(AmountSpecie1.getText());
		float amount2 = Integer.parseInt(AmountSpecie2.getText());
		float birth2 = Float.parseFloat(BirthRate2.getText());
		float death2 = Float.parseFloat(DeathRate2.getText());
		float carryingCapacity1 =  Integer.parseInt(CarryingCapacity1.getText());
		
		CattleCalculator calc = new CattleCalculator();
		float finalValue = calc.calculatePopulationSize(birth1, death1, birth2, death2, amount1, amount2, carryingCapacity1);

	    // Show the line graph
		
	    
		XYChart.Series series = new XYChart.Series(); 
		series.setName("Cattle");
        series.getData().add(new XYChart.Data(1992, amount1)); 
		series.getData().add(new XYChart.Data(2000, finalValue)); 
		linechart.getData().add(series); 
		System.out.println(amount1);

		System.out.println(finalValue);
	} 
	
	@FXML
	public void initialize() {
		NameSpecie1.setText("Cattle");
		NameSpecie2.setText("Horse");
		wolves.setText("12");
		BirthRate1.setText("0.5");
		BirthRate2.setText("0.4");
		DeathRate1.setText("0.2");
		DeathRate2.setText("0.5");
		AmountSpecie1.setText("200");
		AmountSpecie2.setText("500");
		CarryingCapacity1.setText("800");
		
		
	}

	@FXML
	public void newPrediction(){
		wolves.clear();
		NameSpecie1.clear();
		AmountSpecie1.clear();
		BirthRate1.clear();
		DeathRate1.clear();
		NameSpecie2.clear();
		AmountSpecie2.clear();
		BirthRate2.clear();
		DeathRate2.clear();
		CarryingCapacity1.clear();

	}
	
	
	public void close() {
		System.exit(0);
	}
}
