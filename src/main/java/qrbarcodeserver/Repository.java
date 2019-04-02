package qrbarcodeserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;



public class Repository {
	
	

	//private List<GenericResource> resourcesList = new ArrayList<>();
	private Map<String,GenericObject> resourcesList = new HashMap<>();

	
	/*public void addResouce(GenericObject genericResource) {
		this.resourcesList.add(genericResource);
	}
	

	public List<GenericResource> getResourcesList() {
		return resourcesList;
	}

	public void setResourcesList(List<GenericResource> resourcesList) {
		this.resourcesList = resourcesList;
	}*/

        public Map<String,GenericObject> put(String key, GenericObject value) {
            return (Map<String, GenericObject>) resourcesList.put(key, value);
        }

        public Map<String, GenericObject> getResourcesList() {
            return resourcesList;
        }
        
        
        
            


        
//        @Get
//	public String toString() {
//            GenericObject testo = resourcesList.get(0);
//            System.out.println("qrbarcodeserver.Repository.toString()"+ testo);
//            
//            return "scrivi json" + testo;
//            
//
//	}

    public GenericObject get(String key) {

            return resourcesList.get(key);
    }
    
//    @Get
//    public  GenericObject find(String id){
//        //DAOGenericObjects dAOGenericObjects = new DAOGenericObjects();
//        
//        //Repository repository = dAOGenericObjects.charge("");
////        Iterator iterator = resourcesList.entrySet().iterator();
////        while (iterator.hasNext()) {
////            Object next = iterator.next();
////            
////        }
//        for(Map.Entry<String,GenericObject> entry : resourcesList.entrySet()){
//            System.out.println("Key = " + entry.getKey());
//            System.out.println("Value = " + entry.getValue());
//            if(entry.getValue().getId().equals(id)){
//                System.out.println("----"+entry.getValue().getId() + "---" + entry.getValue().getTipo());
//                return  entry.getValue();
//            }
//        }
//        
//        return null;
//    }
    
//    @Get()
//    public String toString(){
//        
//        return "repository";
//    }

    Iterable<Map.Entry<String, GenericObject>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
	
	

}
