
package java_oven_shop;

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
