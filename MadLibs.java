import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adj1, adj2, adj3;
        String noun1;
        String verb1;

        System.out.println("Enter an adjective (describing word): ");
        adj1 = scanner.nextLine();
        System.out.println("Enter a noun (person or animal): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (describing word): ");
        adj2 = scanner.nextLine();
        System.out.println("Enter a verb (in present tense/gerund): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (describing word): ");
        adj3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adj1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adj2 + " and " + verb1 + ".");
        System.out.println("I was " + adj3 + "the " + noun1 + ".");
    }
}
