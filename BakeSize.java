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
public enum BakeSize {
   SMALL(10,2.5,350,500,200,300,50,80),
   MEDIUM(15,3.5,550,700,300,500,75,120),
   LARGE(20,5.5,750,900,400,700,100,150);
   public final double BP;
   public final double Ext_Top;
   public final double Thick_Crust_Weight;
   public final double Thick_Crust_Calories;
   public final double Thin_Crust_Weight;
   public final double Thin_Crust_Calories;
   public final double Extra_Topping_Weight;
   public final double Extra_Topping_Calories;
   BakeSize(double BP,double Ext_Top,double Thick_Crust_Weight,double Thick_Crust_Calories,double Thin_Crust_Weight,double Thin_Crust_Calories,double Extra_Topping_Weight,double Extra_Topping_Calories)
   {
    this.BP=BP;
    this.Ext_Top=Ext_Top;
    this.Thick_Crust_Weight=Thick_Crust_Weight;
    this.Thick_Crust_Calories=Thick_Crust_Calories;
   this.Thin_Crust_Weight=Thin_Crust_Weight;
   this.Thin_Crust_Calories=Thin_Crust_Calories;
   this.Extra_Topping_Weight=Extra_Topping_Weight;
   this.Extra_Topping_Calories=Extra_Topping_Calories;
   }
   public double Basic_Price()
   {
       return BP;
   }
   public double Ext_Top()
   {
       return Ext_Top;
   }
   public double Thick_Crust_Weight()
   {
       return Thick_Crust_Weight;
   }
   public double Thick_Crust_Calories()
   {
       return Thick_Crust_Calories;
   }
   public double Thin_Crust_Weight()
   {
       return Thin_Crust_Weight;
   }
   public double Thin_Crust_Calories()
   {
       return Thin_Crust_Calories;
   }
   public double Extra_Topping_Weight()
   {
       return Extra_Topping_Weight;
   }
   public double Extra_Topping_Calories()
   {
       return Extra_Topping_Calories;
   }
}
