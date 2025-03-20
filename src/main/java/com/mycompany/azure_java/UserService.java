package com.mycompany.azure_java;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "com.mycompany.azure_java.UserInterface")
public class UserService implements UserInterface{

    private static Map<Integer, String> users = new HashMap<>();

    static {
        users.put(1, "Jan Kowalski");
        users.put(2, "Anna Nowak");
        users.put(3, "Piotr Wiśniewski");
    }

    public String getUserById(int id) {
        return users.getOrDefault(id, "Użytkownik nie znaleziony");
    }

    public static void main(String[] args) {
        String url = "http://localhost:8080/users";
        System.out.println("Serwer uruchomiony pod adresem: " + url);
        Endpoint.publish(url, new UserService());
    }
}
