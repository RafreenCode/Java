import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7};
        String[] fruits = {"apple", "banana", "dragon fruit"};

        boolean isFoundNumber = false;
        boolean isFoundFruit = false;

        System.out.print("Enter a number to search for: ");
        int targetNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter a fruit to search for: ");
        String targetFruit = input.nextLine();

        for (int number : numbers){
            if (number == targetNumber){
                isFoundNumber = true;
                break;
            }
        }

        for (String fruit : fruits){
            if (targetFruit.equals(fruit)){
                isFoundFruit = true;
                break;
            }
        }

        if (isFoundNumber && isFoundFruit){
            System.out.println("Both the fruit and number have been found!");
        }

        else if (isFoundNumber && !isFoundFruit){
            System.out.println("The number has been found but the fruit hasn't been found");
        }

        else if (!isFoundNumber && isFoundFruit){
            System.out.println("The fruit has been found but the number hasn't been found");
        }

        else {
            System.out.println("Both the fruit and the number haven't been found");
        }

        input.close();
    }
}
