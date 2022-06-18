package Pizzas;
import java.util.ArrayList;

public class Pizza {
    String category;
    String type;
    String size;
    int itemId, billId, billingCounter, itemIdCounter;

    // constructor
    public Pizza
    (
            int itemId,
            String category,
            String type,
            String size)
    {
        this.itemId = itemId;

        validateCategory(category);
        validateType(type);
        validateSize(size);
    }
    //

    // getters
    public int getItemId(){
        return this.itemId;
    }

    public int getBillId(){
        return this.billId;
    }

    public String getCategory(){
        return this.category;
    }

    public String getType(){
        return this.type;
    }

    public String getSize(){
        return this.size;
    }
    //

    // validators
    public boolean validateCategory(String category){
        ArrayList<String> validCategories = new ArrayList<String>();
            validCategories.add("Veg");
            validCategories.add("NonVeg");

        if (validCategories.contains(category)){
            this.category = category;
            return true;
        } else {
            System.out.println("Sorry, we don't have that category");
            return false;
        }
    }

    public boolean validateSize(String size){
        ArrayList<String> validSizes = new ArrayList<String>();
            validSizes.add("Small");
            validSizes.add("Medium");
            validSizes.add("Large");

        if (validSizes.contains(size)){
            this.size = size;
            return true;
        } else {
            return false;
        }
    }

    public boolean validateType(String type){
        ArrayList<String> validTypes = new ArrayList<String>();
            validTypes.add("Stuffed");
            validTypes.add("Not Stuffed");

        if (validTypes.contains(type)){
            this.type = type;
            return true;
        } else {
            return false;
        }
    }
}



