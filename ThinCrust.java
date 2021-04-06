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
public class ThinCrust extends Pizza {
  
   
    ThinCrust(String name,BakeSize bz)
    {
        
        super(name,bz);
    }
    public double getWeight()
    {
      return super.getSize().Thin_Crust_Weight; 
    }
    public double getCalories()
    {
        return super.getSize().Thin_Crust_Calories;
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
        return this.getClass().getSimpleName()+" - Weight (GRAMS): "+(weight+getWeight())+", Calories : "+(calories+getCalories())+", "+"PRICE :  "+(price+super.getPrice());
        
    }
}
