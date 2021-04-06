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
public class Java_Oven_Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Fatayer ft=new Fatayer(FatayerType.CHEESE);
       // System.out.println(ft);
//        ThinCrust tc1=new  ThinCrust("Four Season",BakeSize.MEDIUM);
//        tc1.addTopping(Topping.ONION);
//        
//        tc1.addTopping(Topping.BEEF);
//        System.out.println(tc1);
        
        
        
        
          StuffedCrust tc2=new  StuffedCrust("Four Season",BakeSize.LARGE);
        tc2.addTopping(Topping.CHICKEN);
        
        tc2.addTopping(Topping.PEPPORONI);
        System.out.println(tc2);
    }
    
}
