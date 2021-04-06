/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oven_shop;

/**
 *
 * @author Abdul Sammad
 */
public class Customer {
    private int customerID;
    private String name;
    private String phone;
    Customer(int customerID,String name, String phone)
    {
        
       
      
    }
    int getCustomerID()
    {
        return customerID;
    }
    void setCustomerID(int customerID)
    {
      this.customerID=customerID;  
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
       this.name=name;  
    }
    String getPhone()
    {
        return phone;
    }
    void setPhone(String phone)
    {
          this.phone=phone;
    }
//    Address getAddress()
//    {
//        Address add=new Address();
//        return add;
//    }
//    void setAddress(Address add)
//    {
//        
//    }
    public String toString()
    {
        return "";
    }
}
