package basicoDinamico;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTreeCell;

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
    private void initialize() {
    	 TreeItem<String> Item = new TreeItem<String>("Conocenos!");
    	 TreeItem<String> historyItem = new TreeItem<String>("Nuestra historia");
    	 historyItem.getChildren().add(new TreeItem<String>("La compañía fue establecida por John Wardle y David Makin , operando desde una sola tienda en Bury, Greater Manchester , en 1981.\n"
    	 		+ "La compañía abrió una tienda en el Arndale Centre en Manchester en 1983.\n"
    	 		+ "Pentland Group compró las acciones de Wardle y Makin por 44,6 millones de libras esterlinas en mayo de 2005,"
    	 		+ "adquiriendo así el 45% del negocio."));
         // Ítem de primer nivel
         TreeItem<String> publicityItem = new TreeItem<String>("Patrocinadores");
         publicityItem.getChildren().add(new TreeItem<String>("Somos el proveedor y patrocinador oficial de numerosos equipos, jugadores y asociaciones de fútbol."
         		+ " En agosto de 2008, JD Sports anunció acuerdos de patrocinio con"
         		+ " AFC Bournemouth , Charlton Athletic , Dundee United , Blackpool , Luton Town y Oldham Athletic."));
         TreeItem<String> workItem = new TreeItem<String>("Trabaja con Nosotros");
         TreeItem<String> webItem = new TreeItem<String>("Via Web");
         webItem.getChildren().add(new TreeItem<String>("Puedes Rellenar nuestro formulario online y dejar tu CV para poder trabajar con nosotros. Asi de fácil!"));
         TreeItem<String> fisicoItem = new TreeItem<String>("Via Tienda");
         fisicoItem.getChildren().add(new TreeItem<String>("Puedes acercarte a cualquiera de nuestras tiendas y dejar tu CV. Seguro que te llamamos!"));
         workItem.getChildren().add(webItem);
         workItem.getChildren().add(fisicoItem);
         Item.getChildren().add(historyItem);
         Item.getChildren().add(publicityItem);
         Item.getChildren().add(workItem);
         
         
         
         
       // Para que sea editable necesitamos especificar un CellFactory con el tipo que corresponda
         historyItem.setExpanded(true);
         tree1.setCellFactory(TextFieldTreeCell.forTreeView());
         tree1.setRoot(Item);
         
       
    }
    
}
