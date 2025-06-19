//import java.util.Scanner;
//
//public static void main() {
//    Scanner input = new Scanner(System.in);
//    Account acc1 = new Account(0.0);
//
//    double amount;
//    boolean isRunning = true;
//    int choice;
//
//    do {
//        System.out.println("\n**********************");
//        System.out.println("BANKING PROGRAM");
//        System.out.println("**********************");
//        System.out.println("1. Show Balance");
//        System.out.println("2. Deposit");
//        System.out.println("3. Withdraw");
//        System.out.println("4. Exit");
//        System.out.println("**********************");
//
//        System.out.print("Enter your choice (1-4): ");
//        choice = input.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.println("Balance: " + acc1.getBalance());
//                break;
//            case 2:
//                System.out.print("How much would you like to deposit? ");
//                amount = input.nextDouble();
//                acc1.deposit(amount);
//                break;
//            case 3:
//                System.out.print("How much would you like to withdraw? ");
//                amount = input.nextDouble();
//                if (!acc1.withdraw(amount)) {
//                    System.out.println("Your amount is too great!");
//                }
//                break;
//            case 4:
//                isRunning = false;
//                break;
//            default:
//                System.out.println("\nEnter in a valid choice!");
//        }
//    } while (isRunning);
//}
