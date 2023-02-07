package application;

import java.io.IOException;

import graficos.CrecimientoController;
import graficos.PicodeVentasController;
import graficos.TopVentasController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuController {
	
	private Stage primaryStage;
	private CrecimientoController creciController;
	// Pantalla principal en la que se añade o quita contenido
	private BorderPane rootLayout;
  
    @FXML
    private void initialize() {
        
    }
    
    @FXML
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamicos.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    private void cerrarListado(ActionEvent event) {    	
    	// Se elimina el contenido del nodo central
    	rootLayout.setCenter(null);	
    }
    
    @FXML
    private void abrirFormulario2(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamicosB.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    private void cerrarListado2(ActionEvent event) {    	
    	// Se elimina el contenido del nodo central
    	rootLayout.setCenter(null);	
    }
    @FXML
    private void abrirFormulario3(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamicosC.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    private void cerrarListado3(ActionEvent event) {    	
    	// Se elimina el contenido del nodo central
    	rootLayout.setCenter(null);	
    }
    @FXML
    public void showTopVentas() {
	    try {
	        // Carga el fichero XML con el pop up de las estadísticas
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("/graficos/GraficoTopVentas.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();
	        Stage dialogStage = new Stage();
	        dialogStage.setTitle("Top Ventas");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);
	        scene.getStylesheets().addAll(this.getClass().getResource("/graficos/GraficosCSS_DanielGarcia.css").toExternalForm());
	        TopVentasController controller = loader.getController();
	        

	        dialogStage.show();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    @FXML
    public void showCrecimiento() {
	    try {
	        // Carga el fichero XML con el pop up de las estadísticas
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("/graficos/GraficoCrecimiento.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();
	        Stage dialogStage = new Stage();
	       
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);
	        scene.getStylesheets().addAll(this.getClass().getResource("/graficos/GraficosCSS_DanielGarcia.css").toExternalForm());
	        CrecimientoController controller = loader.getController();
	       

	        dialogStage.show();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    @FXML
    public void showPico() {
	    try {
	        // Carga el fichero XML con el pop up de las estadísticas
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("/graficos/GraficoPicoVentas.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();
	        Stage dialogStage = new Stage();
	       
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);
	        scene.getStylesheets().addAll(this.getClass().getResource("/graficos/GraficosCSS_DanielGarcia.css").toExternalForm());
	        PicodeVentasController controller = loader.getController();
	       

	        dialogStage.show();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}	
    
}
