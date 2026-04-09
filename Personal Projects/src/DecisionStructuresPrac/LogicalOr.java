package DecisionStructuresPrac;

import java.util.Scanner;

public class LogicalOr
{
    public static void main(String[] args)
    {
        double salary, yearsOnJob;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your annual salary: ");
        salary = keyboard.nextDouble();

        System.out.print("Enter the number of years at your current job: ");
        yearsOnJob = keyboard.nextDouble();

        if (salary >= 50000 && yearsOnJob >= 2)
        {
            System.out.println("You qualify for the loan.");
        }
        else
        {
            System.out.println("You do not qualify.");
        }
    }
}
