package basicoDinamico;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Action;

import EditarTablar.editarTabla;
import application.Main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener.Change;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Clase para la ventada de empleados de la aplicacion
 * @author: Daniel Garcia
 *	@version: 08/02/2023
 * 
 */
public class ListController2  {
	@FXML
	private ImageView zapa1;
	@FXML
	private ImageView zapa2;
	@FXML
	private ImageView zapa3;
	@FXML
    private Button btnAniadir;

    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ListView<String> ListaEmpleados;
    
    @FXML
    private ComboBox<String> combo1;
    
    @FXML
    private TableView<Zapatilla> tablaZapa;
    
    @FXML
    private TableColumn<Zapatilla, String> Name;

    @FXML
    private TableColumn<Zapatilla, String> Stock;
    
    @FXML
    private TreeView<String> tree1;
    
   
    
    // Lista auxiliar para TableView
    private ObservableList<Zapatilla> data = FXCollections.observableArrayList(
    	    new Zapatilla("NIKE Air Force 1", "30"),
    	    new Zapatilla("NIKE Air Jordan 1", "3"),
    	    new Zapatilla("ADIDAS Forum", "21"),
    	    new Zapatilla("NEW BALANCE 2002R", "13"),
    	    new Zapatilla("NIKE Air Max 90", "28"),
    	    new Zapatilla("JORDAN 6 Rings", "30"),
    	    new Zapatilla("EMPORIO ARMANI 7", "10"),
    	    new Zapatilla("ADIDAS Superstar", "8"),
    	    new Zapatilla("Fila Santiago", "32"),
    	    new Zapatilla("ADIDAS Stan Smith", "6")
    	    
    	);

	private Stage dialogStage;
    
    @FXML
    private void initialize() {   
    	 // Asociamos cada columna del TableView a una propiedad de la clase Person 
    	Name.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
        Stock.setCellValueFactory(cellData -> cellData.getValue().getStockProperty());
        // Se rellena la tabla con objetos de la clase Person
        tablaZapa.setItems(data);    
        
        ListaEmpleados.getItems().addAll("Carlos Sainz (Staff)","Charles Lecrecl (Staff)",
        		"Lando Norris(Supervisor)","Nicolas Latifi(Assitant Manager)",
        		"Max Verstappen(Staff)","Fernando Alonso(Manager)"
        		,"Lewis Hamilton(Staff)","Sebastian Vettel(Supervisor)",
        		"George Russel(Staff)","Alexander Albon(Staff)",
        		"Mick Schumacher(Staff)");
        ListaEmpleados.setCellFactory(TextFieldListCell.forListView());
        ListaEmpleados.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ListaEmpleados.getSelectionModel().getSelectedItems().addListener((Change<? extends String> cambio) -> {
    		// Hay que llamar a next para obtener el cambio actual 
    		while (cambio.next()) {
    			 if (cambio.wasAdded()) {
    				 System.out.println("Persona selecionada -> " + cambio.getAddedSubList());
    		     }
    			 if (cambio.wasRemoved()) {
    				 
    			 }
    		 }   		
    	});
       
        editatabla();
       
        
        			        
    }
    @FXML
    private void AgregarStock(ActionEvent event) {
    	
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(editarTabla.class
    			.getResource("/EditarTablar/editaTabla.fxml"));
    	Parent root;
		try {
		root = (AnchorPane) loader.load();
		
    	editarTabla controlador = loader.getController();
    	controlador.iniAtributtes(data);
    	
    	Scene scene = new Scene(root);
    	Stage dialogstage = new Stage();
    	dialogstage.initModality(Modality.APPLICATION_MODAL);
    	dialogstage.setScene(scene);
    	dialogstage.showAndWait();
    	
    	Zapatilla zapa= controlador.getNueva();
    	if(zapa!=null) {
    		this.data.add(zapa);
    		this.tablaZapa.refresh();
    	}
    	
    	controlador.setDialogStage(dialogstage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(ListController2.class.getName()).log(Level.SEVERE,null,e);
		}

		
	}
    private void editatabla() {
    	Name.setCellFactory(TextFieldTableCell.forTableColumn());
    	
    	Name.setOnEditCommit(e->{
    		e.getTableView().getItems().get(e.getTablePosition().getRow()).setName(e.getNewValue());
    		});
    	Stock.setCellFactory(TextFieldTableCell.forTableColumn());
    	
    	Stock.setOnEditCommit(e->{
    		e.getTableView().getItems().get(e.getTablePosition().getRow()).setStock(e.getNewValue());
    	});
    	tablaZapa.setEditable(true);
    }
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    


	
	}
    

