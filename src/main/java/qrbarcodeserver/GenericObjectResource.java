/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrbarcodeserver;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


/**
 *
 * @author franc
 */
public class GenericObjectResource extends ServerResource {
    
    
    @Get("json")
    public Representation getJson(){
        QRBarCodeServer qRBarCodeServer = new QRBarCodeServer();
        String id = (String) getRequest().getAttributes().get("id");


        StringRepresentation rep = null;
        String json = qRBarCodeServer.getJson(id);
        
        

        rep = new StringRepresentation(json,MediaType.APPLICATION_JSON);
        if(json!= null){
            return rep;
        }else{
            setStatus(Status.CLIENT_ERROR_NOT_FOUND);
            return null;
        }
    }
}
