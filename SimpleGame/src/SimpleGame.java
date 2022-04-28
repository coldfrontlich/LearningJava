public class SimpleGame {
    public static void main(String[] args) {
        SimpleDot dot = new SimpleDot();

        int[] locations = {2, 3, 4};

        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult = "Неудача";

        if (result.equals("Попал")) {
            testResult = "Попал";
        }

        System.out.println(testResult);
    }
}
