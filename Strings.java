import java.util.Scanner;

public class Strings {
    public static void main (String[] args){
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = input.nextLine();

        int length = name.length();

        System.out.printf("Your name is %s\n", name);

        System.out.println("The length of your name is " + length);

        boolean greater = length >= 5;

        if (greater){
            System.out.println("Your name has more 4 characters");
        }

        else System.out.println("Your name has less than 5 characters");

        System.out.print("Please enter a character which you'd like to check: ");
        String line = input.nextLine();

        char letter;

        if (!line.isEmpty()){
            name = name.toLowerCase();
            letter = line.charAt(0);
            letter = Character.toLowerCase(letter);
            boolean result = name.contains(String.valueOf(letter));

            if (result){
                System.out.println("The letter " + letter + " is in the string!");
            }

            else{
                System.out.println("The letter " + letter + " is not in the string :(");
            }
        }

        else {
            System.out.println("You didn't put anything!");
            System.exit(0);
        }

        input.close();
    }
}
