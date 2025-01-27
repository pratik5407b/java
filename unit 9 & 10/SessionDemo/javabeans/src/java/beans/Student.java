/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author cva
 */
public class Student implements java.io.Serializable {
    String name;
    String address;
    String contact;
    String email;
    
    public Student() {
        
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   

   
    
}
