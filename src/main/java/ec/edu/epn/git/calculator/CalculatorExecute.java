package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        int addition = c.addition(4, 7);
        System.out.println("c.addition(4,7) = " + addition);

        int subtraction = c.subtraction(7, 1);
        System.out.println("c.subtraction(7,1) = " + subtraction);

        int multiply = c.multiply(5, 8);
        System.out.println("c.multiply(5,8) = " + multiply);

        double division = c.division(500, 5);
        System.out.println("c.division(500,5) = " + division);

        System.out.println("== Input of New Operations ==");

        int addition1 = c.addition(200, 700);
        System.out.println("c.addition(200,700) = " + addition1);

        int subtraction1 = c.subtraction(900, 698);
        System.out.println("c.subtraction(900,698) = " + subtraction1);

        int multiply1 = c.multiply(500, 834);
        System.out.println("c.multiply(500,834) = " + multiply1);

        double division1 = c.division(5000, 575);
        System.out.println("c.division(5000,575) = " + division1);
    }
}