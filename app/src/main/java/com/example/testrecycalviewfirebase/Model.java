package com.example.testrecycalviewfirebase;

public class Model {
    String FoodName, FoodDesCrip, FoodPrice;

    public Model(){}

    public Model(String foodName, String foodDesCrip, String foodPrice) {
        FoodName = foodName;
        FoodDesCrip = foodDesCrip;
        FoodPrice = foodPrice;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public String getFoodDesCrip() {
        return FoodDesCrip;
    }

    public void setFoodDesCrip(String foodDesCrip) {
        FoodDesCrip = foodDesCrip;
    }

    public String getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        FoodPrice = foodPrice;
    }
}
