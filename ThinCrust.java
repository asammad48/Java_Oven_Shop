
package java_oven_shop;

import java.util.ArrayList;

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
         
        String a=super.toString();
        ArrayList<Topping> arr=super.getTopping();
        a=a+"TOPPING ("+super.getToppingCount()+") : ";
        for (int counter = 0; counter < arr.size(); counter++) { 		      
          a=a+arr.get(counter)+"  "; 
          weight=super.getSize().Extra_Topping_Weight+weight;
          calories=super.getSize().Extra_Topping_Calories+calories;
      }
        System.out.println("");
        return a+"\n"+this.getClass().getSimpleName()+" - Weight (GRAMS): "+(weight+getWeight())+", Calories : "+(calories+getCalories())+", "+"PRICE :  "+(getPrice());
        
    }
}
