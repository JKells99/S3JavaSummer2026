package musicstore;

import java.util.Scanner;

public class Store {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Music Store!");
        System.out.println("Please select an option:");
        System.out.println("1. View Inventory");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                displayInventory(scanner);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private static void displayInventory(Scanner scanner) {
        System.out.println("Inventory:");
        System.out.println("1. Guitar - $500");
        System.out.println("2. Piano - $2000");
        System.out.println("3. Drums - $800");
        System.out.println("4. Violin - $1200");
        System.out.println("Please select an item to purchase or 0 to go back:");
    }

}
