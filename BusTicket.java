import java.util.Scanner;

public class BusTicket {
    static int[] seats = new int[11]; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----Online Bus Ticket Booking-----");
            System.out.println("\n1. Book seat\n2. Show the seats\n3. Exit");
            System.out.println("Enter the choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BookSeat();
                    break;
                case 2:
                    ShowSeats();
                    break;
                case 3:
                    System.exit(0); 
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void BookSeat() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the seat no.:");
        int seat = s.nextInt();
        if (seat >= 1 && seat <= 10) {
            if (seats[seat] == 0) {
                seats[seat] = 1;
                System.out.println("Seat Reserved");
            } else {
                System.out.println("The seat is already reserved");
            }
        } else {
            System.out.println("Invalid seat number");
        }
    }

    static void ShowSeats() {
        for (int i = 1; i <= 10; i++) {
            if (seats[i] == 0) {
                System.out.println("Seat " + i + " is available");
            } else {
                System.out.println("Seat " + i + " is reserved");
            }
        }
    }
}
