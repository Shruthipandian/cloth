package shopping;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Main Menu:please choose among the options below\n" +
                "0.  Return to main menu.\n" +
                "1.  open Item options.\n" +
                "2.  open Review options.\n" +
                "3.  open Transaction History options.\n" +
                "Type an option number:");
        int optionNumber = scanner.nextInt();
        scanner.nextLine();
        switch (optionNumber) {
            case 0:
                System.out.println("This option will Return to main menu.");
                break;
            case 1:
                System.out.println("This option will open item options.");
                break;
            case 2:
                System.out.println("This option will open review options.");
                break;
            case 3:
                System.out.println("This option will open transaction history options .");
                break;

            default:
                System.out.println("Invalid  Main menu option. Please type another option.");
        }







        scanner.close();
    }
}













