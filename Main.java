import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter your GWA: ");
//        double GWA = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.print("Are you a student? (True or False): ");
//        boolean answer = scanner.nextBoolean();
//        scanner.nextLine();
//
//        if(answer){
//            System.out.println("\nYour name is " + name);
//            System.out.println("Your age is " + age);
//            System.out.println("Your GWA is " + GWA);
//            System.out.println("You are enrolled as a student");
//        }
//
//        else {
//            System.out.println("You are not a student");
//        }
//    }

        double width, height, area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = height * width;

        System.out.println("The area of the rectangle is: " + String.format("%.1f", area) + "cm sq.");

        scanner.close();
    }
}
