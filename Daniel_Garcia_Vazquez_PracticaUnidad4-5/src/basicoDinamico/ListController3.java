package basicoDinamico;

import java.io.IOException;

import application.MenuController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
/**
 * Clase para el Tutorial de la aplicacion
 * @author: Daniel Garcia
 *	@version: 08/02/2023
 * 
 */
public class ListController3 {

    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ListView<String> list1;
    
    @FXML
    private ComboBox<String> combo1;
    
    @FXML
    private TableView<Zapatilla> table1;

    @FXML
    private TreeView<String> tree1;
    @FXML
    private BorderPane rootLayout;
    @FXML
    private Button btn;
    @FXML
    private void initialize() {
    	 TreeItem<String> Item = new TreeItem<String>("Conocenos!");
    	 TreeItem<String> historyItem = new TreeItem<String>("Nuestra historia");
    	 historyItem.getChildren().add(new TreeItem<String>("La compa��a fue establecida por John Wardle y David Makin, operando desde una sola tienda en Bury,\n"
    	 		+ "Greater Manchester, en 1981. La compa��a abri� una tienda en el Arndale Centre en Manchester\n"
    	 		+ "en 1983. Pentland Group compr� las acciones de Wardle y Makin por 44,6 millones de libras esterlinas\n"
    	 		+ "en mayo de 2005,"
    	 		+ "adquiriendo as� el 45% del negocio."));
         // �tem de primer nivel
         TreeItem<String> publicityItem = new TreeItem<String>("Patrocinadores");
         publicityItem.getChildren().add(new TreeItem<String>("Somos el proveedor y patrocinador oficial de numerosos equipos, jugadores y asociaciones de f�tbol.\n"
         		+ "En agosto de 2008, se anunci� acuerdos de patrocinio con"
         		+ " AFC Bournemouth, Charlton Athletic,\nDundee United, Blackpool, Luton Town y Oldham Athletic."));
         TreeItem<String> workItem = new TreeItem<String>("Trabaja con Nosotros");
         TreeItem<String> webItem = new TreeItem<String>("Via Web");
         webItem.getChildren().add(new TreeItem<String>("Puedes Rellenar nuestro formulario online y dejar tu CV para poder trabajar con nosotros. Asi de f�cil!"));
         TreeItem<String> fisicoItem = new TreeItem<String>("Via Tienda");
         fisicoItem.getChildren().add(new TreeItem<String>("Puedes acercarte a cualquiera de nuestras tiendas y dejar tu CV. Seguro que te llamamos!"));
         TreeItem<String> buyItem = new TreeItem<String>("Como comprar unas zapatillas(Tutorial)");
         buyItem.getChildren().add(new TreeItem<String>("1� Ve a la Penta�a Comprar y haz click en Pedir\n"+
         "2� Elige el tipo y el n�mero de tu zapatilla\n"+"3� Elige entre a domicilio o a tienda, rellena los datos y listo!"));
         workItem.getChildren().add(webItem);
         workItem.getChildren().add(fisicoItem);
         Item.getChildren().add(historyItem);
         Item.getChildren().add(publicityItem);
         Item.getChildren().add(workItem);
         Item.getChildren().add(buyItem);
         
         
         
         
       // Para que sea editable necesitamos especificar un CellFactory con el tipo que corresponda
         historyItem.setExpanded(true);
         tree1.setCellFactory(TextFieldTreeCell.forTreeView());
         tree1.setRoot(Item);
         
         
         EventHandler<MouseEvent> raton=((MouseEvent event)->{
        	 System.out.println("Pulsando el rat�n");
         });
         tree1.addEventFilter(MouseEvent.MOUSE_PRESSED, raton);
       
    }
    @FXML
    private void abrirFormularioPedido(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ListController3.class.getResource("ControlesDinamicos.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
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
