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

import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.cell.TextFieldTableCell;


public class ListController2  {

    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ListView<String> list1;
    
    @FXML
    private ComboBox<String> combo1;
    
    @FXML
    private TableView<Zapatilla> table1;
    
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

    @FXML
    private void initialize() {   
    	 // Asociamos cada columna del TableView a una propiedad de la clase Person 
    	Name.setCellValueFactory(new PropertyValueFactory<Zapatilla,String>("Name"));
        Stock.setCellValueFactory(new PropertyValueFactory<Zapatilla,String>("Stock"));
        // Se rellena la tabla con objetos de la clase Person
        table1.setItems(data);    
        
        list1.getItems().addAll("Carlos Sainz (Staff)","Charles Lecrecl (Staff)",
        		"Lando Norris(Supervisor)","Nicolas Latifi(Assitant Manager)",
        		"Max Verstappen(Staff)","Fernando Alonso(Manager)"
        		,"Lewis Hamilton(Staff)","Sebastian Vettel(Supervisor)",
        		"George Russel(Staff)","Alexander Albon(Staff)",
        		"Mick Schumacher(Staff)");
        list1.setCellFactory(TextFieldListCell.forListView());
        list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
       
        editatabla();
       
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
    	table1.setEditable(true);
    }
	
	}
    

