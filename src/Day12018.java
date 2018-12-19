
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day12018 {

    public static void main(String[] args) {

        String elevatorButtons = new String();

        try {
            FileReader file = new FileReader("src/day1.txt");
            BufferedReader br = new BufferedReader(file);
            elevatorButtons = br.readLine();
            System.out.println("File found...");

        } catch (FileNotFoundException ex) {
            System.err.println("File not found...");
        } catch (IOException ex) {
            System.err.println("Someting happened...");
        }

        int floorNumber = 0;
        int basementButtonIndex = 0;

        for (int currentButtonNumber = 0; currentButtonNumber < elevatorButtons.length(); currentButtonNumber++) {

            if (elevatorButtons.charAt(currentButtonNumber) == '(') {
                floorNumber++;
            }

            if (elevatorButtons.charAt(currentButtonNumber) == ')') {
                floorNumber--;
            }
            if ((floorNumber == -1) && basementButtonIndex == 0) {
                basementButtonIndex = currentButtonNumber;
            }
        }
        System.out.println("Part 1: We are at floor: " + floorNumber);
        System.out.println("Part 2: Basement floor at: " + (basementButtonIndex + 1));
    }
}
