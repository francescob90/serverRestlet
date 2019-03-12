/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrbarcodeserver;

import org.restlet.resource.Get;

/**
 *
 * @author franc
 */
public interface IGenericObject {
    
    @Get
    public GenericObject retrive();
    
}
