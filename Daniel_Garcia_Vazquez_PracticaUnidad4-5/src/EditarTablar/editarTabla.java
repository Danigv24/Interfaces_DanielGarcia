package EditarTablar;



import basicoDinamico.Zapatilla;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.stage.Stage;
/**
 * Clase para editar la tabla de la ventana de Empleados de la aplicacion
 * @author: Daniel Garcia
 *	@version: 08/02/2023
 * 
 */
public class editarTabla {
		@FXML
		private  Button bntGuardar;
		@FXML
		private  Button bntSalir;
		
	    @FXML
	    private TextField txtName;
	    @FXML
	    private TextField txtStock;
	    
	    private Zapatilla nuevaZapa;
	    private ObservableList<Zapatilla> zapatilla;
		private Stage dialogStage;

	    
	    
	    // Este componente ser� un di�logo. Campos auxiliares para su gesti�n
//	    private Stage dialogStage;
//	    private Zapatilla zapa;
//	    private boolean okClicked = false;

	    /**
	     * M�todo para inicializar el controlador que se llama cuando se carga el FXML
	     */
	    @FXML
	    private void initialize() {
	    	if(txtName!=null) {
	    		txtName.setOnMouseEntered((event->
	    		txtName.setCursor(Cursor.HAND)));
	    	}
	    	if(txtStock!=null) {
	    		txtStock.setOnMouseEntered((event->
	    		txtStock.setCursor(Cursor.HAND)));
	    	}
	    }
	    public void iniAtributtes(ObservableList<Zapatilla> zapatilla) {
	    	this.zapatilla=zapatilla;
	    	
	    }
	    @FXML
	    private void Guardar() {
	    	String nombre=this.txtName.getText();
	    	String stock=this.txtStock.getText();
			Zapatilla nueva = new Zapatilla(nombre,stock);
			 
			if(!zapatilla.contains(nueva)) {
				this.nuevaZapa=nueva;
				Alert alert= new Alert(Alert.AlertType.CONFIRMATION);
				alert.setHeaderText(null);
				alert.setTitle("Informaci�n");
				alert.setContentText("Se ha a�adido correctamente");
				alert.showAndWait();
				
				Stage stage = (Stage) this.bntGuardar.getScene().getWindow();
				stage.close();
			}
			else {
				Alert alert= new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("La zapatilla ya existe");
				alert.showAndWait();
			}
		}
	    
	    @FXML
	    private void Salir() {
	    	this.nuevaZapa=null;
	    	Stage stage = (Stage) this.bntGuardar.getScene().getWindow();
			stage.close();
			
		}

	    
	   
    
	    
		/**
		 * @return the nueva
		 */
		public Zapatilla getNueva() {
			return nuevaZapa;
		}
		
		/**
		 * @return the bntGuardar
		 */
		public Button getBntGuardar() {
			return bntGuardar;
		}
		/**
		 * @return the bntSalir
		 */
		public Button getBntSalir() {
			return bntSalir;
		}
		/**
		 * @return the txtName
		 */
		public TextField getTxtName() {
			return txtName;
		}
		/**
		 * @return the txtStock
		 */
		public TextField getTxtStock() {
			return txtStock;
		}
		/**
		 * @return the zapatilla
		 */
		public ObservableList<Zapatilla> getZapatilla() {
			return zapatilla;
		}
		/**
		 * @return the dialogStage
		 */
		public Stage getDialogStage() {
			return dialogStage;
		}
		/**
	     * M�todo set de la propiedad dialogStage
	     * 
	     * @param dialogStage
	     */
	    public void setDialogStage(Stage dialogStage) {
	        this.dialogStage = dialogStage;
	    }

	}