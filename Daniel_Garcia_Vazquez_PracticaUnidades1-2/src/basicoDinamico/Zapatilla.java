package basicoDinamico;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 
 * Clase auxiliar que se empleará para el modelo de datos del TableView
 * 
 * @author SBF
 * 
 */
public class Zapatilla {
    private final SimpleStringProperty Name;
    private final SimpleIntegerProperty Stock;
   
 
    public Zapatilla(String Name,Integer Stock) {
        this.Name = new SimpleStringProperty(Name);
        this.Stock = new SimpleIntegerProperty(Stock);
       
    }
 
    public String getName() {
        return Name.get();
    }
    
    public void setName(String fName) {
    	Name.set(fName);
    }
        
    public Integer getStock() {
        return Stock.get();
    }
    public void setStock (Integer fName) {
    	Stock.set(fName);
    }
    
    
        
}