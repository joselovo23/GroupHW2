package com.syntax.groupHW2;
//create interface shape
public interface Shape {
    //undefined methods
    void calculateArea(int num1);
    void calculatePerimeter(int num2);
}
//create class Circle, make sure it implements functionality
class Circle implements Shape{

    //implement method 1 (override)
    public void calculateArea(int num2) {
        double area;
        area=3.1415*num2*num2;
        System.out.println("The area of the circle is "+area);
    }

    //implement method2(override)
    public void calculatePerimeter(int num2) {
        double perimeter;
        perimeter= 3.1415*2*num2;
        System.out.println("The perimeter of the circle is "+perimeter);
    }
}
//create a class Square, make sure it implements functionality
class Square implements Shape{

    //implement method1(override)
    public void calculateArea(int num1) {
        int area = num1*num1;
        System.out.println("The area of the square is "+area);
    }

    //implement method 2(override)
    public void calculatePerimeter(int num1) {
        int perimeter = 4*num1;
        System.out.println("The perimeter of the square is "+perimeter);
    }
}

