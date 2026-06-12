package MethodOverloading;

public class Calculator {

        public int calculate(int a, int b){
            return a+b;
        }

        public int calculate(int a, int b, int c){
            return a+b+c;
    }

    public double calculate(double a, double b){
            return a+b;
    }

    public int multiply(int a, int b){
            return a*b;
        }

        public static void main(String[] args){

            Calculator c = new Calculator();

            System.out.println(c.calculate(5,6));
            System.out.println(c.calculate(2,5,9));
            System.out.println(c.calculate(7.8,5.8));
            System.out.println(c.multiply(5,8));
        }
}
