package chapterSeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuestInvitation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList<String>();

        System.out.println("How many guests are you expecting?");
        int numberOfGuests = input.nextInt();
        input.nextLine(); // consume the newline character left by nextInt()

        for (int i = 1; i <= numberOfGuests; i++) {
            System.out.println("Enter a guest's name:");
            String name = input.nextLine();
            guests.add(name);
        }

        System.out.println("Enter the guest's name: ");
        String guestName = input.nextLine();
        if (guests.contains(guestName)) {System.out.println("You are welcome");}
        else {System.out.println("You are not invited");}
    }
}