public class Arrays {
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

        System.out.println(add(sizeGreeting, 4));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
