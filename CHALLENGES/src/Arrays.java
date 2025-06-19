import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        input.nextLine();

        String[] foods = new String[size];

        for (int i = 0; i < size; i++){
            System.out.printf("Enter in the food %d: ", i + 1);
            foods[i] = input.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }
    }
}
