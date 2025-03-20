package com.mycompany.azure_java;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService // oznaczenie klasy jako SEO (Service Endpoint Interface)
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserInterface{
    @WebMethod String getUserById(int id);
}