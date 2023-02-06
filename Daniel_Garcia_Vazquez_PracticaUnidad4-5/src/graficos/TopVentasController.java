package graficos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;


public class TopVentasController {
	
	@FXML
	private PieChart pieChart;
	
	
	@FXML
	private void initialize() {
		// Rellenamos los datos del gráfico
		ObservableList<PieChart.Data> pieChartData =
				FXCollections.observableArrayList(
						new PieChart.Data("NIKE Air Force 1", 45),
						new PieChart.Data("NIKE Air Jordan 1", 25),
						new PieChart.Data("ADIDAS FORUM", 10),
						new PieChart.Data("JORDAN Retro 4", 15),
						new PieChart.Data("NEW BALANCE 530", 5));
		pieChart.setData(pieChartData);
	}
	

}
