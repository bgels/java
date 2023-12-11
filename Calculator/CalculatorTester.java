package Calculator;

import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double a = input.nextDouble();
        double b = input.nextDouble();

        input.close();

        Calculator calc = new Calculator();

        double sum = calc.sum(a, b);
        double multi = calc.multiply(a, b);
        double quotient = calc.divide(a, b);
        double difference = calc.subtract(a, b);

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + b + " = " + multi);
        System.out.println(a + " / " + b + " = " + quotient);
        

        
    }
}
