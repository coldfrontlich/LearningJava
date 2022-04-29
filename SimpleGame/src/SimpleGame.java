public class SimpleGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDot dotCom = new SimpleDot();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        dotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("������� �����:");
            String result = dotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("�������")) {
                isAlive = false;
                System.out.println("��� ������������� " + numOfGuesses + " �������(�)");
            }
        }
    }
}
