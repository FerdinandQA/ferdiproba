package learningjava;

import java.util.Scanner;

public class CARS
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter reg number");
        String regNumber = scanner.nextLine();
        System.out.println("Welcome " + regNumber + "))");

        System.out.println("Enter your age");
        int userAge = scanner.nextInt();

        if (userAge < 1) {return;}
        if (userAge < 18) {System.out.println("Grow Up");}
        else {System.out.println("CHEERS");}
    }
}
