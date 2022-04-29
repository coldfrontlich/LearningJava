public class SimpleDot {
    private int[] locationCells;
    private int numOfHits = 0;

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "����";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "�����";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "�������";
        }
        System.out.println(result);

        return result;
    }

    public void setLocationCells(int[] location) {
        locationCells = location;
    }

}
