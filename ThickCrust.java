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
