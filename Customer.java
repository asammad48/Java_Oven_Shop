
package java_oven_shop;


public class Customer {
    private int customerID;
    private String name;
    private String phone;
    private Address add;
    Customer(int customerID,String name, String phone)
    {
        setCustomerID(customerID);
        setName(name);
        setPhone(phone);
        
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
    Address getAddress()
    {
        return add;
    }
    void setAddress(Address add)
    {
        this.add=add;
    }
    public String toString()
    {
        return this.getClass().getSimpleName()+ "   ID: "+getCustomerID()+", Name: "+getName()+", Phone: "+getPhone()+"\n"+add;
    }
}
