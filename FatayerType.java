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
public enum FatayerType {
    CHEESE(240,300),
    ZAATER(250,250),
    LHMAACHIN(180,250),
    SPINACH(250,200);
    public final double weight;
    public final double calories;
    private FatayerType(double weight, double calories)
    {
        this.weight=weight;
        this.calories=calories;
    }
    public double getWeight()
    {
        return weight;
    }
    public double getCalories()
    {
        return calories;
    }
}
