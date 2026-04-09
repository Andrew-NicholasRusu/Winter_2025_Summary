package DecisionStructuresPrac;

import java.util.Scanner;

public class Division
{
    public static void main(String[] args){
        int number1, number2;
        double quotient;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    number1 = keyboard.nextInt();
    System.out.println("Enter another integer: ");
    number2 = keyboard.nextInt();

    if (number2 == 0)
    {
        System.out.println("DecisionStructuresPrac.Division by zero is not possible");
        System.out.println("Please run the program again and ");
        System.out.println("enter a number other than zero. ");
    }
    else
    {
        quotient = (double) number1 / number2;
        System.out.println(" The quotient of " + number1);
        System.out.println(" divided by " + number2);
        System.out.println(" is " + quotient);
    }
  }
}
