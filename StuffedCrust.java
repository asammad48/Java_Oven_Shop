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
        return super.getWeight()+
    }
    public double getCalories()
    {
        
    }
    public double getPrice()
    {
        
    }
    public String toString()
    {
        System.out.println(super.toString());
    }
}
