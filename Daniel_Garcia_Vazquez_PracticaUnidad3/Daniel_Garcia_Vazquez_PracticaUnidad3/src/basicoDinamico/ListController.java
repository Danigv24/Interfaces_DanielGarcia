package basicoDinamico;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener.Change;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Alert;
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
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


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
	private Button bntEnviar;
    @FXML
    private Text txtprecio;
    @FXML
    private BorderPane rootLayout;

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se añaden directamente los items 
    	// Ítems del ChoiceBox
        choice1.getItems().addAll("NIKE Air Force 1", "NIKE Air Jordan 1", "ADIDAS Forum",
        		"NEW BALANCE 2002R", "NIKE Air Max 90", 
        		"JORDAN 6 Rings", "EMPORIO ARMANI 7", "ADIDAS Superstar", "Fila Santiago",
        		 "ADIDAS Stan Smith");      
        choice1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
			@Override
			public void changed(ObservableValue obs, String old, String nuevo) {
				// TODO Auto-generated method stub
				System.out.println(nuevo);

				Precio(nuevo);
	        		
	        	
			};
    
    });
        	
        
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
        
        if(txtDescripcion!=null) {
        	txtDescripcion.setOnMouseEntered((event->
        	txtDescripcion.setCursor(Cursor.HAND)));
    	}
        if(combo1!=null) {
        	combo1.setOnMouseEntered((event->
        	combo1.setCursor(Cursor.HAND)));
    	}
        if(choice1!=null) {
        	choice1.setOnMouseEntered((event->
        	choice1.setCursor(Cursor.HAND)));
    	}
       
    }
    @FXML
    private void enviar() {
    	Alert alert= new Alert(Alert.AlertType.CONFIRMATION);
		alert.setHeaderText(null);
		alert.setTitle("Información");
		alert.setContentText("Se ha envidado correctamente");
		alert.showAndWait();
    }
    private void mostrarTecla(KeyEvent event) {
		System.out.println("Key code " + event.getEventType().getName() + ": " + event.getCode() + ","
				+ " Key text " + event.getEventType().getName() + ": " + event.getText() + ","
				+ " Key character " + event.getEventType().getName() + ": " +  (int) event.getCharacter().charAt(0));
	}
    @FXML
    private void Precio(String zapa) {
    	if(zapa.equals("NIKE Air Force 1")) {
    		txtprecio.setText("120€");
    	}
    	else if(zapa.equals("NIKE Air Jordan 1")){
    		txtprecio.setText("150€");
    	}
    	else if(zapa.equals("ADIDAS Forum")){
    		txtprecio.setText("100€");
    	}
    	else if(zapa.equals("NEW BALANCE 2002R")){
    		txtprecio.setText("OFERTA! 70€");
    	}
    	else if(zapa.equals("NIKE Air Max 90")){
    		txtprecio.setText("140€");
    	}
    	else if(zapa.equals("JORDAN 6 Rings")){
    		txtprecio.setText("170€");
    	}
    	else if(zapa.equals("EMPORIO ARMANI 7")){
    		txtprecio.setText("210€");
    	}
    	else if(zapa.equals("ADIDAS Superstar")){
    		txtprecio.setText("105€");
    	}
    	else if(zapa.equals("Fila Santiago")){
    		txtprecio.setText("OFERTA! 50€");
    	}
    	else if(zapa.equals("ADIDAS Stan Smith")){
    		txtprecio.setText("115€");
    	}
    }
	/**
	 * @return the txtprecio
	 */
	public Text getTxtprecio() {
		return txtprecio;
	}
	/**
	 * @param txtprecio the txtprecio to set
	 */
	public void setTxtprecio(Text txtprecio) {
		this.txtprecio = txtprecio;
	}
    
}
