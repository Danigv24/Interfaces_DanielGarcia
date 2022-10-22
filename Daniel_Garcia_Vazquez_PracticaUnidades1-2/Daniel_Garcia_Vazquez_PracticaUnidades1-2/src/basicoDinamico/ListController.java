package basicoDinamico;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.cell.TextFieldTreeCell;

public class ListController {

    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ListView<String> list1;
    
    @FXML
    private ComboBox<String> combo1;
    
    @FXML
    private TableView<Person> table1;
    
    @FXML
    private TableColumn<Person, String> firstNameCol;

    @FXML
    private TableColumn<Person, String> lastNameCol;

    @FXML
    private TableColumn<Person, String> emailCol;
    
    @FXML
    private TableColumn<Person, Integer> ageColumn;
    
    @FXML
    private TreeView<String> tree1;
    
    

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
        
       
    }
    
}
