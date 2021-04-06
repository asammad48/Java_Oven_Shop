/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oven_shop;

import java.util.ArrayList;


 enum Stuffed{
    SMALL(5,35,100),
    MEDIUM(8,120,170),
    LARGE(12,170,280);
    public final double price;
    public final double weight;
    public final double calories;
    Stuffed(double price,double weight,double calories)
    {
        this.price=price;
        this.weight=weight;
        this.calories=calories;
    }
    public double getCalories()
    {
      return calories;  
    }
    public double getWeight()
    {
        return weight;
    }
    public double getPrice()
    {
        return price;
    }
}
public class StuffedCrust extends ThickCrust
{
   StuffedCrust(String Name,BakeSize bz)
   {
        super(Name,bz);
    }
    public double getWeight()
    {
        String name=getSize().toString();
       return Stuffed.valueOf(name).getWeight()+super.getWeight();
    }
    public double getCalories()
    {
        String name=getSize().toString();
        return super.getCalories()+Stuffed.valueOf(name).getCalories();
    }
    public double getPrice()
    {
        String name=getSize().toString();
        return super.getPrice()+Stuffed.valueOf(name).getPrice();
    }
    public String toString()
    {
     double weight=0;
     double calories=0;
     double price=0;
        System.out.println(super.toString());
        ArrayList<Topping> arr=super.getTopping();
        System.out.print("TOPPING ("+super.getToppingCount()+") : ");
        for (int counter = 0; counter < arr.size(); counter++) { 		      
          System.out.print(arr.get(counter)+"  "); 
          weight=super.getSize().Extra_Topping_Weight+weight;
          calories=super.getSize().Extra_Topping_Calories+calories;
          price=super.getSize().Ext_Top+price;
      }
        System.out.println("");
        return this.getClass().getSimpleName()+" - Weight (GRAMS): "+(weight+getWeight())+", Calories : "+(calories+getCalories())+", "+"PRICE :  "+(price+getPrice());
    }
}
