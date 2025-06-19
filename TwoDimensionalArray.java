public class TwoDimensionalArray {
    public static void main(String[] args) {

        String[][] groceries = {{"apple", "banana", "orange"},
                                {"chicken", "pork", "beef"},
                                {"carrot", "squash", "eggplant"}};

        groceries[0][0] = "dragonfruit";

        for (String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");
            }

            System.out.println();
        }
    }
}
