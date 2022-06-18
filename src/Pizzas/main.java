package Pizzas;

public class main {
    static int billingId, itemId;
    public static void main(String args[]){
        // order;
        Pizza pizza = new Pizza(1,"Veg","Stuffed","Small");
        itemId += 1;
        //

        // billing;
        switch(pizza.category){
            case "Veg":
                Veg veg = new Veg();
                System.out.println(veg.identifyCost(pizza.type, pizza.size));
                billingId += 1;
                 break;
            case "NonVeg":
                NonVeg nonVeg = new NonVeg();
                System.out.println(nonVeg.identifyCost(pizza.type, pizza.size));
                billingId += 1;
                break;
        }
        //
    }
}
