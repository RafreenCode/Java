import java.util.Scanner;

 class ShoppingCart {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();
        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();
        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is $" + String.format("%.2f", quantity * price));

        scanner.close();
    }
}
