import java.util.ArrayList;

public class SimpleDot {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> location) {
        locationCells = location;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }

}
