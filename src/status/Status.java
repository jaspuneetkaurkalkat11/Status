package status;

import java.util.Scanner;

/**
 * This class now uses an enum to handle user statuses, which improves type safety
 * and reduces errors related to direct string manipulation.
 * The user enters a status code as a numeric value which is then mapped to an enum constant.
 * @author jaspuneetkaurkalkat
 */
public class Status {

    /**
     * Enum for User Status with a method to print status details.
     */
    enum UserStatus {
        REJECTED, PENDING, PROCESSING, APPROVED;

        public void printStatus() {
            switch (this) {
                case REJECTED:
                    System.out.println("User status: Rejected");
                    break;
                case PENDING:
                    System.out.println("User status: Pending");
                    break;
                case PROCESSING:
                    System.out.println("User status: Processing");
                    break;
                case APPROVED:
                    System.out.println("User status: Approved");
                    break;
                default:
                    System.out.println("Unknown status");
            }
        }
    }

    /**
     * Main method to run the application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (0 for REJECTED, 1 for PENDING, 2 for PROCESSING, 3 for APPROVED):");
        
        int statusCode = in.nextInt();  // Changed from String to int for enum index
        UserStatus[] statuses = UserStatus.values();

        if (statusCode >= 0 && statusCode < statuses.length) {
            UserStatus currentStatus = statuses[statusCode];
            currentStatus.printStatus();
        } else {
            System.out.println("Invalid status code entered.");
        }
        in.close();
    }
}
