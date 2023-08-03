package chapterSeven;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuestCheck {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<String>();

        String input = JOptionPane.showInputDialog(null, "How many guests are you expecting?");
        int numberOfGuests = Integer.parseInt(input);

        for (int i = 1; i <= numberOfGuests; i++) {
            String name = JOptionPane.showInputDialog(null, "Enter a guest's name:");
            guests.add(name);
        }

        String guestName = JOptionPane.showInputDialog(null, "Enter the guest's name:");
        if (guests.contains(guestName)) {
            JOptionPane.showMessageDialog(null, "You are welcome");
        } else {
            JOptionPane.showMessageDialog(null, "You are not invited");
        }
    }
}



