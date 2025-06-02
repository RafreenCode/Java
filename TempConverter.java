import java.util.Scanner;

public class TempConverter {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double temp;

        System.out.print("Enter the temperature: ");
        temp = input.nextDouble();


        System.out.print("Convert this to Fahrenheit or Celsius? (C or F): ");
        char choice = input.next().toUpperCase().charAt(0);

        double newTemp = (choice == 'C') ? (temp - 32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf("The temperature is %.2f%c", newTemp, choice);

        input.close();
    }
}
