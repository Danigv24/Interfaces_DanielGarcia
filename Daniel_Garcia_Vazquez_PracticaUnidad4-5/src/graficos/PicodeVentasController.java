package graficos;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class PicodeVentasController {
	@FXML
    private LineChart<String, Number> lineChart;
	
	@FXML
	private void initialize() {
		lineChart.setData(Picoanios());
	}
	public ObservableList<XYChart.Series<String, Number>> Picoanios(){
		List<XYChart.Series<String, Number>> list = new ArrayList<XYChart.Series<String,Number>>();
	

//		// Se crean dos series con datos
		XYChart.Series<String, Number> pico = new XYChart.Series<String, Number>();
		pico.setName("Millones");
		pico.getData().add(new XYChart.Data<String, Number>("2010", 9));
		pico.getData().add(new XYChart.Data<String, Number>("2011", 7));
		pico.getData().add(new XYChart.Data<String, Number>("2012", 6));
		pico.getData().add(new XYChart.Data<String, Number>("2013", 9));
		pico.getData().add(new XYChart.Data<String, Number>("2014", 9));
		pico.getData().add(new XYChart.Data<String, Number>("2015", 10));
		pico.getData().add(new XYChart.Data<String, Number>("2016", 15));
		pico.getData().add(new XYChart.Data<String, Number>("2017", 17));
		pico.getData().add(new XYChart.Data<String, Number>("2018", 12));
		pico.getData().add(new XYChart.Data<String, Number>("2019", 5));
		pico.getData().add(new XYChart.Data<String, Number>("2020", 6));
		pico.getData().add(new XYChart.Data<String, Number>("2021", 11));
		
		list.add(pico);
		
        return FXCollections.observableArrayList(list);
	}
	
}
