
package java_oven_shop;

import java.util.ArrayList;


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
        double price=0;
        arr=getTopping();
        for (int counter = 0; counter < arr.size(); counter++) { 		      
          price=price+bz.Ext_Top;
      }
        return price+bz.BP;
    }
    public String toString()
    {
        return getType()+": "+getName()+",  size: "+getSize();
    }
}
