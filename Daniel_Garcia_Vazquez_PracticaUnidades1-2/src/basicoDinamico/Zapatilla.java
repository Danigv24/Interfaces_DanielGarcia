package basicoDinamico;


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
    private final SimpleStringProperty Stock;
   
 
    public Zapatilla(String Name,String Stock) {
        this.Name = new SimpleStringProperty(Name);
        this.Stock = new SimpleStringProperty(Stock);
       
    }
 
    public String getName() {
        return Name.get();
    }
    
    public void setName(String fName) {
    	Name.set(fName);
    }
        
    public String getStock() {
        return Stock.get();
    }
    public void setStock (String fName) {
    	Stock.set(fName);
    }
    
    
        
}