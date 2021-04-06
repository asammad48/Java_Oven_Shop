
package java_oven_shop;

import java.util.ArrayList;


public class ThickCrust extends Pizza
{
    
    ThickCrust(String name,BakeSize bz)
    {
        
        super(name,bz);
    }
    public double getWeight()
    {
      return super.getSize().Thick_Crust_Weight; 
    }
    public double getCalories()
    {
        return super.getSize().Thick_Crust_Calories;
    }
    @Override
    public String toString()
    {
        
        return super.toString();
        
        
    }
}
