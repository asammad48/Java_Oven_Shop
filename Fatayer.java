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
public class Fatayer implements Bakeable {
    private FatayerType getFatayer;
    Fatayer(FatayerType ft)
    {
        setFatayerType(ft);
        n=getName();
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
        return "ABC";
    }
    public String getName()
{
    return getFatayer.getClass();
}
}

