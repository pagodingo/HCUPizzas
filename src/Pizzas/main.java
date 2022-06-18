package Pizzas;

// app
class main {
    static int billIds, pizzaIds;
    // run
    static void main(String args[]){
        // order pizza;
        Pizza pizza = new Pizza(pizzaIds,"Veg","Stuffed","Small");
        pizzaIds += 1;
        //

        // billing;
        switch(pizza.category){
            case "Veg":
                Veg veg = new Veg();
                System.out.println(veg.calculateCost(pizza.type, pizza.size));
                billIds += 1;
                //
                 break;
            case "NonVeg":
                NonVeg nonVeg = new NonVeg();
                System.out.println(nonVeg.calculateCost(pizza.type, pizza.size));
                billIds += 1;
                //
                break;
        }
        //
    }
    //
}
//

