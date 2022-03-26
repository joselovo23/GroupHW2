package com.syntax.groupHW2;
//Create class 'Marks' with an abstract method 'getPercentage
//that will be returning the average percentage of marks
abstract class Marks {
    int grade1;
    int grade2;
    int grade3;
    int grade4;

    Marks(int grade1, int grade2, int grade3, int grade4){
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
        this.grade4=grade4;
    }
    //create an abstract method 'getPercentage' A & B
    double getPercentageA(){
        //the constructor of student A takes the marks in three subjects
        return (grade1+grade2+grade3)/3;
    }
    double getPercentageB(){
        //the constructor of student B takes the mark in four subjects
        return (grade1+grade2+grade3+grade4)/4;
    }
}
//provide implementation of abstract method in classes 'A' & 'B'
class A extends Marks{
    //create constructor matching super
    A(int grade1, int grade2, int grade3, int grade4) {
        super(grade1, grade2, grade3, grade4);
    }

    @Override
    double getPercentageA() {
        return super.getPercentageA();
    }
}
class B extends Marks{
    //create constructor matching super
    B(int grade1, int grade2, int grade3, int grade4) {
        super(grade1, grade2, grade3, grade4);
    }

    @Override
    double getPercentageB() {
        return super.getPercentageB();
    }
}
public class MarksAverage{
    public static void main(String[] args) {
        //create objects for students A & B

        Marks studentA = new A(88,72,56,92);
        Marks studentB = new B(55,74,88,65);

        System.out.println("The average percentage of student A is "+studentA.getPercentageA());
        System.out.println("The average percentage of student B is "+studentB.getPercentageB());

    }
}
