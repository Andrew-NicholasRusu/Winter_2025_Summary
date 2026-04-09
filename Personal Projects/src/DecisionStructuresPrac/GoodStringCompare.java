package DecisionStructuresPrac;
import java.util.Scanner;

public class GoodStringCompare
{
    public static void main(String[] args)
    {
        String name1, name2, name3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name:");
        name1 = sc.nextLine();

        System.out.println("Enter a second name:");
        name2 = sc.nextLine();

        System.out.println("Enter a third name:");
        name3 = sc.nextLine();

        if (name1.equals(name2))
        {
            System.out.println(name1 + " and " + name2 + " are the same.");
        }
        else
        {
            System.out.println(name1 + " and " + name2 + " are not the same.");
        }

        if (name1.equals(name3))
        {
            System.out.println(name1 + " and " + name3 + " are the same.");
        }
        else
        {
            System.out.println(name1 + " and " + name3 + " are not the same.");
        }
    }
}



