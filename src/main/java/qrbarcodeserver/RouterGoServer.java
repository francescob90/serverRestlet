/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrbarcodeserver;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

/**
 *
 * @author franc
 */
public class RouterGoServer extends Application{
    
    public static void main(String[ ] args) throws Exception {

        Component c = new Component();
        //c.getServers().add(Protocol.HTTP, 8182);
        c.getServers().add(Protocol.HTTPS);
        //c.getServers().add(Protocol.HTTPS, "https://frozen-cliffs-97695.herokuapp.com/");
        c.getDefaultHost().attach(new RouterGoServer());

        c.start();
    } 
    
    @Override
    public synchronized Restlet createInboundRoot() {
        
        Router router = new Router(getContext());
       
        router.attach("/genericobject/{id}",GenericObjectResource.class);
       //
        //router.attach("/genericObject",GenericObjectResource.class);
        System.out.println("--********--");
        return router;
    }
    
    
}
