//Banking app


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine();

        int noOfRetries = 1;

        while (noOfRetries <= 3) {
            if (nameCheck(inputName)) {
                break;
            } else {
                noOfRetries++;
                System.out.print("Enter your name again: ");
                inputName = scanner.nextLine();
            }
            if (noOfRetries > 3) {
                System.out.println("Your account is blocked");
                return;
            }
        }

//--------------------------------------------------------------------------------------------------------------------------

        Scanner password = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String inputPassword = password.nextLine();

        int noOfRetriesPassword = 1;

        while (noOfRetriesPassword <= 3) {
            if (passwordCheck(inputPassword)) {
                break;
            } else {
                noOfRetriesPassword++;
                System.out.print("Enter your password again: ");
                inputPassword = password.nextLine();
            }
            if (noOfRetriesPassword > 3) {
                System.out.println("Your account is blocked");
                return;
            }
        }


        System.out.println("Welcome, " + inputName + "!");


//------------------------------------------------------------------------------------------------------------------------

        int accountBalance = 15000;
        String currency = "EUR";

        while (true) {
            System.out.println("Your current balance is: " + accountBalance + " " + currency);
            System.out.print("Do you want to perform another action? (yes/no): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("no")) {
                System.out.println("Exiting the application.");
                break;
            } else if (response.equalsIgnoreCase("yes")) {
                System.out.println("Press 0 to withdraw money\nPress 1 to add money\nPress 2 to exit the application");

                int actionIndex = scanner.nextInt();

                if (actionIndex == 0) {
                    System.out.print("Enter the amount to withdraw: ");
                    int amountToWithdraw = scanner.nextInt();
                    if (amountToWithdraw <= accountBalance) {
                        accountBalance -= amountToWithdraw;
                        System.out.println("You withdrew " + amountToWithdraw + currency + ". Your new balance is: " + accountBalance + currency);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                } else if (actionIndex == 1) {
                    System.out.print("Enter the amount to add: ");
                    int amountToAdd = scanner.nextInt();
                    accountBalance += amountToAdd;
                    System.out.println("You added " + amountToAdd + currency + ". Your new balance is: " + accountBalance + currency);
                } else if (actionIndex == 2) {
                    System.out.println("Exiting the application.");
                    break;
                } else {
                    System.out.println("Invalid action. Please press 0, 1, or 2 to perform an action.");
                }
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }
        }

        scanner.close();
    }

    public static boolean nameCheck(String name) {
        String userName = name;
        if (userName.equals("Iancu Popescu")) {
            System.out.println("Valid username");
            return true;
        } else {
            System.out.println("Invalid username");
            return false;
        }
    }

    public static boolean passwordCheck(String password) {
        int number;
        try {
            number = Integer.parseInt(password);
        } catch (NumberFormatException e) {
            System.out.println("Invalid password format");
            return false;
        }

        String str = String.valueOf(number);

        int length = str.length();
        if (length != 4) {
            System.out.println("Invalid number of characters");
            return false;
        }
        if (number == 2385) {
            System.out.println("Valid password");
            return true;
        } else {
            System.out.println("Invalid password");
            return false;
        }
    }
}
