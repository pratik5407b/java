/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author lenovo
 */
public class Customer implements java.io.Serializable {
    String name;
    String address;
    String id;
    
    
    public Customer() {
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String contact) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        this.name = "BCIS" +name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   

}

