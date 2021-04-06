
package java_oven_shop;

import java.util.ArrayList;
import java.util.Date;


public class BakesOrder
{
 private int orderID;
 private Date orderDate;
 private Customer cus;
 ArrayList<Bakeable> arrbo;
 private int Item_Count=0;
 BakesOrder(int orderID, Customer cus)
 {
     setOrderID(orderID);
     setCustomer(cus);
     setBakes(arrbo);
 }
 BakesOrder(int orderID,Customer cus,ArrayList<Bakeable> arr)
 {
     
 }
 int getOrderID()
 {
     return orderID;
 }
 void setOrderID(int orderID)
 {
     this.orderID=orderID;
 }
 Customer getCustomer()
 {
     return cus;
 }
 void setCustomer(Customer cus)
 {
   this.cus=cus;
 }
 ArrayList<Bakeable> getBakes()
 {
     return arrbo;
 }
 void setBakes(ArrayList<Bakeable> arr)
 {
     this.arrbo=arr;
     this.arrbo=new ArrayList<Bakeable>();
 }
 Date getOrderDate()
 {
    return orderDate; 
 }
 void setOrderDate(Date date)
 {
     long millis=System.currentTimeMillis(); 
     this.orderDate=date;
     this.orderDate=new java.util.Date(millis);  
     
 }
 void addBakeable(Bakeable br)
 {
     arrbo.add(br);
     Item_Count++;
 }
 int getItemsCount()
 {
     
     return Item_Count;
 }
 double getTotalPrice()
 {
    double TotalPrice=0;
    for (int counter = 0; counter < arrbo.size(); counter++) 
    { 		      
          TotalPrice=TotalPrice+arrbo.get(counter).getPrice();
    }
    return TotalPrice;
 }
 public String toString()
 {
     String a="DATE: "+getOrderDate()+" ID: "+getOrderID()+" Items: "+getItemsCount()+" Total Price: "+getTotalPrice()+"\n"+cus+"\n"+"-----------Order Details-----------"+"\n";
     for (int counter = 0; counter < arrbo.size(); counter++) 
    { 		      
          a=a+arrbo.get(counter)+"\n";
    }
     return a;
 }
}
