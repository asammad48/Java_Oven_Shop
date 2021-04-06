
package java_oven_shop;


public class Fatayer implements Bakeable {
    private FatayerType getFatayer;
    Fatayer(FatayerType ft)
    {
        setFatayerType(ft);
    }
    FatayerType getFatayerType()
    {
     return getFatayer;
    }
    void setFatayerType(FatayerType ft)
    {
        getFatayer=ft;
    }
    public String getType()
    {
        return getFatayer.toString();
    }
    public double getPrice()
    {
        return 9.0;
    }
    public double getCalories()
    {
        return getFatayer.getCalories();
    }
    public double getWeight()
    {
        return getFatayer.getWeight();
    }
    public String toString()
    {
        return getName()+":  "+getType()+",  PRICE: "+getPrice()+",  Weight:  "+getWeight()+",  Calories:  "+getCalories();
    }
    public String getName()
{
    return this.getClass().getSimpleName().toString();
}
}

