package graficos;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

public class CrecimientoController {
	@FXML
    private StackedBarChart<String, Number> stackedBarChart;

	@FXML
	private void initialize() {
		stackedBarChart.setData(Comparaanios());
	}
	
	 
    public ObservableList<XYChart.Series<String, Number>> Comparaanios(){
		List<XYChart.Series<String, Number>> list = new ArrayList<XYChart.Series<String,Number>>();
	

//		// Se crean dos series con datos
		XYChart.Series<String, Number> anio2022 = new XYChart.Series<String, Number>();
		anio2022.setName("2022");
		anio2022.getData().add(new XYChart.Data<String, Number>("Ene", 3));
		anio2022.getData().add(new XYChart.Data<String, Number>("Feb", 4));
		anio2022.getData().add(new XYChart.Data<String, Number>("Mar", 6));
		anio2022.getData().add(new XYChart.Data<String, Number>("Abr", 7));
		anio2022.getData().add(new XYChart.Data<String, Number>("May", 9));
		anio2022.getData().add(new XYChart.Data<String, Number>("Jun", 10));
		anio2022.getData().add(new XYChart.Data<String, Number>("Jul", 10));
		anio2022.getData().add(new XYChart.Data<String, Number>("Ago", 12));
		anio2022.getData().add(new XYChart.Data<String, Number>("Sep", 15));
		anio2022.getData().add(new XYChart.Data<String, Number>("Oct", 17));
		anio2022.getData().add(new XYChart.Data<String, Number>("Nov", 20));
		anio2022.getData().add(new XYChart.Data<String, Number>("Dic", 22));
		
		// Se crean dos series con datos
		XYChart.Series<String, Number> anio2021 = new XYChart.Series<String, Number>();
		anio2021.setName("2021");
		anio2021.getData().add(new XYChart.Data<String, Number>("Ene", 2));
		anio2021.getData().add(new XYChart.Data<String, Number>("Feb", 2));
		anio2021.getData().add(new XYChart.Data<String, Number>("Mar", 4));
		anio2021.getData().add(new XYChart.Data<String, Number>("Abr", 5));
		anio2021.getData().add(new XYChart.Data<String, Number>("May", 7));
		anio2021.getData().add(new XYChart.Data<String, Number>("Jun", 8));
		anio2021.getData().add(new XYChart.Data<String, Number>("Jul", 5));
		anio2021.getData().add(new XYChart.Data<String, Number>("Ago", 9));
		anio2021.getData().add(new XYChart.Data<String, Number>("Sep", 13));
		anio2021.getData().add(new XYChart.Data<String, Number>("Oct", 13));
		anio2021.getData().add(new XYChart.Data<String, Number>("Nov", 18));
		anio2021.getData().add(new XYChart.Data<String, Number>("Dic", 20));

		
		list.add(anio2022);
		list.add(anio2021);
		
        return FXCollections.observableArrayList(list);
	}
	/**
	 * @return the stackedBarChart
	 */
	public StackedBarChart<String, Number> getStackedBarChart() {
		return stackedBarChart;
	}
	/**
	 * @param stackedBarChart the stackedBarChart to set
	 */
	public void setStackedBarChart(StackedBarChart<String, Number> stackedBarChart) {
		this.stackedBarChart = stackedBarChart;
	}
	/**
	 * @return the dist1
	 */
	
    
	
}
