package com.syntax.groupHW2;

public class carTest {
    public static void main(String[] args) {

        Car sedan = new Sedan(15000, "blue",12);
        sedan.display();

        Car truck = new Truck(18000, "green", 1200);
        truck.display();
    }
}
