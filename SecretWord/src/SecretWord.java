import java.util.Scanner;

import static java.lang.System.*;

public class secretword {
}
public static void main(String[] args)
{
    String input;
    Scanner keyboard = new Scanner(in);
    out.println("Enter the secret word: ");
    input = keyboard.nextLine();
    if (input.equalsIgnoreCase("COOLORIO"))
    out.println("Congratulations! You know the " +
            "secret word!");

    }
    else
    {
       System.out.println("Sorry, that is NOT the "+
                "secret word!")
    }


}
