package MethodOverloading;

import java.util.Scanner;

public class AreaCalculator {

    public static double  calculateArea(double side){
        return side*side;
    }

    public static double calculateArea(double length, double width){
        return length*width;

    }

    public static double calculateArea(float radius){

        return Math.PI * radius*radius;
    }

    public static double calculateArea(float base, double height){
        return 0.5*base*height;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("----Area Calculator----");


        System.out.println("Enter the side of square");
        double side= sc.nextDouble();
        System.out.println("Area of square: " +calculateArea(side));

        System.out.println("Enter the length of rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of rectangle");
        double width= sc.nextDouble();
        System.out.println("Area of rectangle: " +calculateArea(length,width));

        System.out.println("Enter the radius of circle");
        float radius = sc.nextFloat();
        System.out.println("Area of circle: " +calculateArea(radius));

        System.out.println("Enter the base of triangle");
        float base = sc.nextFloat();
        System.out.println("Enter the height triangle");
        double height= sc.nextDouble();
        System.out.println("Area of triangle: " +calculateArea(base,height));

        sc.close();

    }


}
