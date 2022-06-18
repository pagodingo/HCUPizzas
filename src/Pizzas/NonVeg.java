package Pizzas;

import java.util.HashMap;

class NonVeg extends Accounting{
    double tax = 0.1;

    //Stuffed Prices
    HashMap<String, Integer> nonVegStuffedPrices = new HashMap<String, Integer>();{
        nonVegStuffedPrices.put("Small",50);
        nonVegStuffedPrices.put("Medium",100);
        nonVegStuffedPrices.put("Large",150);
    };
    // Not Stuffed Prices
    HashMap<String, Integer> nonVegNotStuffedPrices = new HashMap<String, Integer>();{
        nonVegNotStuffedPrices.put("Small",40);
        nonVegNotStuffedPrices.put("Medium",80);
        nonVegNotStuffedPrices.put("Large",120);
    };

    NonVeg(){}

    @Override
    double identifyCost(String type, String size){
        int cost;

        if (type == "Stuffed"){
            cost = nonVegStuffedPrices.get(size);
        } else {
            cost = nonVegNotStuffedPrices.get(size);
        }
        return calculateBilling(cost);
    }

    @Override
    double calculateBilling(int cost){
        return (cost * this.tax) + cost;
    }


}

