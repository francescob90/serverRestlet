package qrbarcodeserver;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import java.util.HashMap;
import java.util.Map;


//public class GenericObject extends ServerResource implements IGenericObject{
public class GenericObject {
    
    private String id;
    private String tipo;
	
    private Map<String,String> mapStringAttibutes = new HashMap<String,String>();
    //private Map<String,GenericObject> mapStringAttGen = new HashMap<String,GenericObject>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
        
        

    public String putString(String key, String value) {
        return mapStringAttibutes.put(key, value);
    }

    public String get(String key) {
        return mapStringAttibutes.get(key);
    }
    
    @JsonAnyGetter
    public Map<String, String> getMapStringAttibutes() {
        return mapStringAttibutes;
    }

//    public GenericObject getGen(Object key) {
//        return mapStringAttGen.get(key);
//    }
//
//    public GenericObject putGen(String key, GenericObject value) {
//        return mapStringAttGen.put(key, value);
//    }

//    @Override
//    public String retrive() {
//        System.out.println("GET - GenObj");
//        return "ZAZZAZZAZAZZ";
//    }
    
//    @Get
//	public String toString() {
//            Model model = new Model();
//            String testo = (String)  model.get(Costanti.JSON);
//            System.out.println("qrbarcodeserver.GenericObject.toString()"+ testo);
//            //GenericObject testo = resourcesList.get(0);
//            return "scrivi json" + testo;
//	}
    
//    @Get
//    public String toString(){
//        return "genericObjects";
//    }
//    
//    @Get("json")
//    public Representation getJSON() {
//        String id = (String) getRequest().getAttributes().get("id");
//        return new StringRepresentation(this.id,MediaType.APPLICATION_JSON);
//    }
//    
    
    

    
    
    
        
        
        
	

}
