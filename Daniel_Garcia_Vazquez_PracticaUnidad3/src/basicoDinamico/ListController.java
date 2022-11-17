package basicoDinamico;

import javafx.collections.ListChangeListener.Change;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.KeyEvent;


public class ListController {
	@FXML
    private TextField txtDescripcion;
    
    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ListView<String> list1;
    
    @FXML
    private ComboBox<String> combo1;
    
    @FXML
    private TableView<Zapatilla> table1;
    
    @FXML
    private TableColumn<Zapatilla, String> firstNameCol;

    @FXML
    private TableColumn<Zapatilla, String> lastNameCol;

    @FXML
    private TableColumn<Zapatilla, String> emailCol;
    
    @FXML
    private TableColumn<Zapatilla, Integer> ageColumn;
    
    @FXML
    private TreeView<String> tree1;
    @FXML
	private  Button bntEnviar;
    

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se añaden directamente los items 
    	// Ítems del ChoiceBox
        choice1.getItems().addAll("NIKE Air Force 1", "NIKE Air Jordan 1", "ADIDAS Forum",
        		"NEW BALANCE 2002R", "NIKE Air Max 90", 
        		"JORDAN 6 Rings", "EMPORIO ARMANI 7", "ADIDAS Superstar", "Fila Santiago",
        		 "ADIDAS Stan Smith");      
        
        // Ítems del ComboBox
        combo1.getItems().addAll("38","39", "40", "41", "42", "43", "44",
        		"45");
                
     // Ítems del ListView (con la segunda línea se asigna un CellFactory para permitir que sean editables)
        list1.getItems().addAll("Islazul", "Parquesur", "Plaza Rio","Vaguada","Xanadú","Tres Aguas");
        list1.setCellFactory(TextFieldListCell.forListView());
        list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        list1.getSelectionModel().getSelectedItems().addListener((Change<? extends String> cambio) -> {
    		// Hay que llamar a next para obtener el cambio actual 
    		while (cambio.next()) {
    			 if (cambio.wasAdded()) {
    				 System.out.println("Tienda Elegida -> " + cambio.getAddedSubList());
    		     }
    			 if (cambio.wasRemoved()) {
    			 }
    		 }   		
    	});
        
        //Evento que muestra la tecla de la tabla ASCII
        txtDescripcion.setOnKeyPressed((event) -> mostrarTecla(event));
        txtDescripcion.setOnKeyReleased((event) -> mostrarTecla(event));
        txtDescripcion.setOnKeyTyped((event) -> mostrarTecla(event));
       
    }
    private void mostrarTecla(KeyEvent event) {
		System.out.println("Key code " + event.getEventType().getName() + ": " + event.getCode() + ","
				+ " Key text " + event.getEventType().getName() + ": " + event.getText() + ","
				+ " Key character " + event.getEventType().getName() + ": " +  (int) event.getCharacter().charAt(0));
	}
}
