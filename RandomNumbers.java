import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(1,6);

        System.out.println("The number is: " + number);

        char letter = (char)('a' + random.nextInt(26));
        String upper = Character.toString(letter).toUpperCase();
        System.out.println("The random letter is: " + upper);
    }
}
