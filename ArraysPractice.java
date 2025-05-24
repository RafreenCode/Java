import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

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
        }
    }
}
