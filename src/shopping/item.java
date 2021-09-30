package shopping;

import java.util.Scanner;

public class item {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Item options menu:\n" +
                "0.  Return to main menu.\n" +
                "1.  Create an item.\n" +
                "2.  Remove an item\n" +
                "3.  Print all registered Items.\n" +
                "4.  Buy an item.\n" +
                "5.  Update an item's name.\n" +
                "6.  Update an item's price.\n" +
                "Type an option number:");
        int optionNumber = scanner.nextInt();
        scanner.nextLine();
        switch (optionNumber){
            case 0:
                System.out.println("Return to main menu.");
                break;
            case 1:
                System.out.println("create an item.");
                break;
            case 2:
                System.out.println("Remove an item.");
                break;
            case 3:
                System.out.println("print all registred items.");
                break;

            case 4:
                System.out.println("buy an item.");
                break;
            case 5:
                System.out.println("Update an item's name.");
                break;
            case 6:
                System.out.println("Update an item's price.");
                break;

            default:
                System.out.println("Invalid option menu. Please type another option.");
        }

        scanner.close();
    }
}
