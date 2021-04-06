/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oven_shop;

import java.util.ArrayList;

/**
 *
 * @author Abdul Sammad
 */
public abstract class Pizza implements Bakeable 
{
    private String Name;
    private ArrayList<Topping> arr;
    private BakeSize bz;
    private Topping tp;
    private int count=0;
    Pizza(String name,BakeSize bz)
    {
        setName(name);
        setTopping(arr);
        this.bz=bz;
   }
    Pizza(String name,BakeSize bz,ArrayList<Topping> arr)
    {
        
    }
    public String getName()
    {
        return Name;
    }
   void setName(String name)
    {
     this.Name=name;   
    }
   BakeSize getSize()
   {
       return bz;
   }
    void setTopping(ArrayList<Topping> arr)
    {
         this.arr=arr;
         this.arr=new ArrayList<Topping>();
    }
    ArrayList<Topping> getTopping()
    {
       return this.arr;        
    }
    void addTopping(Topping topping)
    {
        this.arr.add(topping);
        count++;
    }
    public String getType()
    {
        return this.getClass().getSimpleName();
    }
    int getToppingCount()
    {
        return count;
    }
    public double getPrice()
    {
        return bz.BP;
    }
    public String toString()
    {
        return getType()+": "+getName()+",  size: "+getSize();
    }
}
