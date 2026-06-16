import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        DonationManager manager = new DonationManager();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Item  2. View Items  3. Exit");
            int choice = input.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter food: ");
                String name = input.next();
                manager.addDonation(new Donation(name, 10, "2024-12-01"));
            } else if (choice == 2) {
                manager.showAll();
            } else {
                break; 
            }
        }
    }
}
