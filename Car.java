package com.syntax.groupHW2;
//create a class Car; carPrice, color, and a method calculateSalePrice()
public class Car {
    int carPrice;
    String color;
    Car (int carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    //method
    double calculateSalePrice(){
        return carPrice;
    }
    void display(){
        System.out.println();
    }
}
//create 2 sub classes: Sedan & Truck
class Sedan extends Car{
        int length;
    Sedan(int carPrice, String color, int length) {
        super(carPrice, color);
    }
    double calculateSalePrice(){
        if(length > 20){
            return carPrice * 0.95;
        }else{
            return carPrice * 0.9;
        }
    }

    @Override
    void display() {
        System.out.println("The price of the Sedan is "+calculateSalePrice()+" and the color is "+color);

    }
}
class Truck extends Car{
    int weight;

    Truck(int carPrice, String color, int weight) {
        super(carPrice, color);
    }

    @Override
    double calculateSalePrice() {
        if(weight > 2000){
            return carPrice*0.9;
        }else{
            return carPrice*0.8;
        }
    }

    @Override
    void display() {
        System.out.println("The price of the Truck is "+calculateSalePrice()+" and the color is "+color);
    }
}
