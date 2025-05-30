import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);

        for (int i : numbers){
            System.out.print(i + " ");
        }

        System.out.println();

        String greeting = "Welcome to CIT-U";

        System.out.println(greeting);
        int sizeGreeting = greeting.length();

        System.out.println(sizeGreeting);

        System.out.println(MathUtils.add(sizeGreeting, 4));

        for (int i = 0; i < sizeGreeting; i++){
            System.out.print(greeting.charAt(i));
            if (i == sizeGreeting - 1){
                System.out.println();
            }
        }

        System.out.print("What is your favorite number? ");
        double number = scanner.nextDouble();

        System.out.println("The square root of your number is: " + MathUtils.root(number));
        System.out.println("Your number raised to the power of 2 is: " + String.format("%.2f", MathUtils.power(number, 2)));
        System.out.println("Your number added to 5 is: " + MathUtils.add((int)number, 5));
    }
}
