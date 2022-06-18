package Pizzas;
import java.util.HashMap;

public class Veg{
    private String vegToppings;
    private double tax = .05;

    // Stuffed Prices
    HashMap<String, Integer> vegStuffedPrices = new HashMap<String, Integer>();{
        vegStuffedPrices.put("Small",30);
        vegStuffedPrices.put("Medium",60);
        vegStuffedPrices.put("Large",90);
    };
    // Not Stuffed Prices
    HashMap<String, Integer> vegNotStuffedPrices = new HashMap<String, Integer>();{
        vegNotStuffedPrices.put("Small",20);
        vegNotStuffedPrices.put("Medium",40);
        vegNotStuffedPrices.put("Large",80);
    };

    public double identifyCost(String type, String size){
        int cost;

        if (type == "Stuffed"){
            cost = vegStuffedPrices.get(size);
        } else {
            cost = vegNotStuffedPrices.get(size);
        }
        return calculateBilling(cost);
    };

    public double calculateBilling(int cost){
        return (cost * this.tax) + cost;
    };

}
