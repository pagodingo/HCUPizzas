package Pizzas;
import java.util.ArrayList;

class Pizza {
    int pizzaId;
    String category;
    String type;
    String size;

    // constructor
    Pizza
    (
     int pizzaId,
     String category,
     String type,
     String size
    ) {
        this.pizzaId = pizzaId;
        validateCategory(category);
        validateType(type);
        validateSize(size);
    }
    //

    // getters
    int getPizzaId(){
        return this.pizzaId;
    }

    String getCategory(){
        return this.category;
    }

    String getType(){
        return this.type;
    }

    String getSize(){
        return this.size;
    }
    //

    // validators
    boolean validateCategory(String category){
        ArrayList<String> validCategories = new ArrayList<String>();
            validCategories.add("Veg");
            validCategories.add("NonVeg");

        if (validCategories.contains(category)){
            this.category = category;
            return true;
        } else {
            System.out.println("Sorry, we don't have " + category);
            return false;
        }
    }

    boolean validateType(String type){
        ArrayList<String> validTypes = new ArrayList<String>();
        validTypes.add("Stuffed");
        validTypes.add("Not Stuffed");

        if (validTypes.contains(type)){
            this.type = type;
            return true;
        } else {
            System.out.println("Sorry, we don't have " + type);
            return false;
        }
    }

    boolean validateSize(String size){
        ArrayList<String> validSizes = new ArrayList<String>();
            validSizes.add("Small");
            validSizes.add("Medium");
            validSizes.add("Large");

        if (validSizes.contains(size)){
            this.size = size;
            return true;
        } else {
            System.out.println("Sorry, we don't have " + size);
            return false;
        }
    }
}



