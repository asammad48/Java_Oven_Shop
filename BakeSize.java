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
   BakeSize(double BP,double Ext_Top,double Thick_Crust_Weight,double Thick_Crust_Calories,double Thin_Crust_Weight,double Thin_Crust_Calories,double Extra_Topping_Weight,double Extra_Topping_Calories)
   {
       
   }
}
