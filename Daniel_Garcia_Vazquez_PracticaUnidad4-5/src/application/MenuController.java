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
/**
 * Menu para abrir las diferentes ventanas de la aplicacion
 * @author: Daniel Garcia
 *	@version: 08/02/2023
 * 
 */
public class MenuController {
	
	private Stage primaryStage;
	private CrecimientoController creciController;
	// Pantalla principal en la que se a�ade o quita contenido
	private BorderPane rootLayout;
  
    @FXML
    private void initialize() {
        
    }
    /**
     * 
     * @param metodo que abre el formulario
     */
    @FXML
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamicos.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
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
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamicosB.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
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
    /**
     * 
     * @param metodo que abre la tercera ventana
     */
    @FXML
    private void abrirFormulario3(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamicosC.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
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
    /**
     * @param metodo que abre un PieChart
     */
    @FXML
    public void showTopVentas() {
	    try {
	        // Carga el fichero XML con el pop up de las estad�sticas
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
    /**
     * @param metodo que abre un StackedBarCharrt
     */
    @FXML
    public void showCrecimiento() {
	    try {
	        // Carga el fichero XML con el pop up de las estad�sticas
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
    /**
     * @param metodo que abre LineChart
     */
    @FXML
    public void showPico() {
	    try {
	        // Carga el fichero XML con el pop up de las estad�sticas
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
