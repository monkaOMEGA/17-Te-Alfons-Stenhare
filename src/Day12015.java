
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Day12015 {

    public static void main(String[] args) {
        int floor = 0;

        String elevator = new String();

        try {
            FileReader file = new FileReader("src/Day12015.txt");
            BufferedReader br = new BufferedReader(file);
            elevator = br.readLine();

            System.out.println("File found...");
            System.out.println(elevator);
        } catch (FileNotFoundException ex) {
            System.err.println("File not found...");
        } catch (IOException ex) {
            System.err.println("Something happened...");
        }

        for (int number = 0; number < elevator.length(); number++) {
            if (elevator.charAt(number) == '(') {
                floor++;
            }
            if (elevator.charAt(number) == ')') {
                floor--;
            }
        }
        System.out.println("We are at floor: " + floor);
    }
}
