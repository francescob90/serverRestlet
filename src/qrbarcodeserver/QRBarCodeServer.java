package qrbarcodeserver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QRBarCodeServer{
        
	
	

        
        
        //public GenericObject getJson(String id){
        public String getJson(String id){
            DAOGenericObjects dAOGenericObjects = new DAOGenericObjects();
            Repository repository = dAOGenericObjects.charge("");
            
            
            //Collection<GenericObject> values = repository.getResourcesList().values();
            //System.out.println("Valori" + values);
            for (GenericObject genericObject : repository.getResourcesList().values()) {
                if(genericObject.getId().equalsIgnoreCase(id)){
                    GenericObject genericObjectSelected = genericObject; 
                    //return genericObject;
        //            return genericObjectSelected;
                    
                    //SE SERVE LA STRINGA
                    try {
                        ObjectMapper mapper = new ObjectMapper();
                        String testo = mapper.writeValueAsString(genericObjectSelected);
                        return testo;
                    } catch (JsonProcessingException ex) {
                        Logger.getLogger(QRBarCodeServer.class.getName()).log(Level.SEVERE, null, ex);
                        return "";
                    }
                }
           
            }
            return "Codice id non presente";
            //return  null;
        }
        

    
        
        

}
