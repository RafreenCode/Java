import java.util.Scanner;

 class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Calculator Program!");
        System.out.println("Please input an operation which you'd like to use (+, -, /, *) and the numbers. \nThis program will stop when " +
                "you enter an invalid operation or when you type in \"=\". ");

        double result = 0;
        double number;

        System.out.print("Enter in your number: ");
        result = input.nextDouble();

        while(true){

            System.out.print("Enter the operation: ");
            char operation = input.next().charAt(0);

            if (operation == '=') {
                System.out.printf("The result is: %.2f\n", result);
                System.exit(0);
            }

            System.out.print("Enter in your number: ");
            number = input.nextDouble();

            switch(operation){
                case '+':
                    result += number;
                    break;

                case '-':
                    result -= number;
                    break;

                case '/':
                    if (number == 0) {
                        System.out.println("Error: Division by zero!");
                        System.exit(1);
                    }

                    result /= number;
                    break;

                case '*':
                    result *= number;
                    break;

                default: System.out.println("Please choose a valid operation!");
                    System.exit(1);
            }
        }
    }
}
