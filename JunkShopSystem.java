// Junk Shop System
// Created by Christiane A. Bacani
import java.util.Scanner;

public class JunkShopSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {15, 3, 2};
        boolean sell = true;
        double total = 0;

        System.out.print("WELCOME TO OUR JUNK SHOP!\n");
        System.out.print("Press enter to continue : ");
        String pressEnter = input.nextLine();

        while (sell) {
            System.out.print("PLEASE PICK THE JUNK/S YOU`VE WANTED TO SELL :\n");
            System.out.print("1.) Bakal\n2.) Lata\n3.) Bote\n");
            System.out.print("Enter your choice here : ");
            int userChoice = input.nextInt();

            if (userChoice >= 1 && userChoice <= 3) {
                System.out.print("Enter how many kilo/s : ");
                int kilos = input.nextInt();
                
                double totalPrice = price[userChoice - 1] * kilos;
                total += totalPrice;

                System.out.print("The total price is : P  " + totalPrice + "\n");
            } else {
                System.out.print("\n\nINVALID CHOICE!\n");
            }
            
            System.out.print("Do you want to sell another item? (Y/N) : ");
            String sellAnother = input.next();
            if(sellAnother.equalsIgnoreCase("N")){
                sell = false;
                System.out.println("Total earnings: P " + total);
            }
        }
    }
}
