package learningjava;

import java.util.Scanner;

public class MyNameIsMyName
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String userName = ("My name is who");
        System.out.println(userName);
        String who = scanner.nextLine();

        System.out.println("My name is " + who + "!");

    }

}
