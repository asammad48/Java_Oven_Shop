
package java_oven_shop;


public class Java_Oven_Shop {

    
    public static void main(String[] args) {
        
        
        
        
        Fatayer f = new Fatayer(FatayerType.CHEESE); 
        StuffedCrust tc3 = new StuffedCrust("Supreme Cheese", BakeSize.LARGE); 
        tc3.addTopping(Topping.ONION); tc3.addTopping(Topping.CHEESE); 
        ThinCrust tc4=new ThinCrust("Magnum", BakeSize.MEDIUM);
        tc4.addTopping(Topping.OLIVES);
        Address a1 = new Address (45, 70, "Wadi Albanat"); 
        Customer cust1= new Customer(100, "Ali Hassan Abdulla", "66779988"); 
        cust1.setAddress(a1); 
        BakesOrder bo1 = new BakesOrder(123, cust1);  
        bo1.addBakeable(tc3); bo1.addBakeable(f); bo1.addBakeable(tc4);
        System.out.println(bo1); 
    }
    
}
