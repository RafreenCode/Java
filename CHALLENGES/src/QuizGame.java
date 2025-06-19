import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // QUESTIONS Array

        String[] questions = {
                "What is the most famous Pokemon?",
                "What company is the biggest in the CPU industry?",
                "What school does Ralph go to?",
                "Does Ralph need a Huzz?",
                "What happens if you jump into lava?"
        };

        //OPTIONS Array

        String[][] options = {
                {"Pikachu", "Sceptile", "Azumarill", "Beedrill"},
                {"AMD", "Intel", "Raspberry", "NVIDIA"},
                {"CIT-U", "SCSIT", "CNU", "USC"},
                {"Yes", "No", "Annika", "Talamban"},
                {"You become Steve", "You die", "Go to heaven", "Eat at D'Lucky Corner"}};

        //DECLARE VARIABLES
        int[] answers = {1, 2, 1, 3, 4};
        int score = 0;
        int guess, j = 1;

        Scanner input = new Scanner(System.in);

        //WELCOME MESSAGE
        System.out.println("**************************");
        System.out.println("Welcome to the Quiz game!");
        System.out.println("**************************");

        //QUESTION (loop)

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            //OPTIONS
            for (String option : options[i]){
                System.out.println(j + ". " + option);
                j++;
            }

            j = 1;
            //GET GUESS FROM USER -> CHECK OUR GUESS
            System.out.print("What is your answer? (Type in the number only): ");
            guess = input.nextInt();

            if (guess == answers[i]){
                score++;
                System.out.println("*********");
                System.out.println("CORRECT!");
                System.out.println("*********");
            }

            else {
                System.out.println("*********");
                System.out.println("WRONG!");
                System.out.println("*********");
            }
        }


        //DISPLAY FINAL SCORE

        System.out.println("Your score is: " + score + "/" + questions.length);

        input.close();
    }
}
