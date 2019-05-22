package insultgenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class InsultFive {

    /**
     * Arrays för att hålla reda på förolämpningens olika delar
     */
    private ArrayList<String> choice1 = new ArrayList<>();
    private ArrayList<String> choice2 = new ArrayList<>();
    private ArrayList<String> choice3 = new ArrayList<>();

    private Random r = new Random();

    /**
     * Konstruktor
     *
     * @throws java.io.FileNotFoundException
     */
    public InsultFive() {
        choice1 = readFile("src/insultgenerator/choice1.txt");
        choice2 = readFile("src/insultgenerator/choice2.txt");
        choice3 = readFile("src/insultgenerator/choice3.txt");
    }

    /**
     * readFile läser ein fil och sparar i en ArrayList
     *
     * @param fileName
     * @return
     */
    private ArrayList<String> readFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        lines.clear();

        try {
            FileReader file = new FileReader(fileName);
            BufferedReader buffer = new BufferedReader(file);
            String line;
            line = buffer.readLine();
            while (!(line == null)) {
                lines.add(line);
                line = buffer.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.err.println("File not found...");
        } catch (IOException ex) {
            System.err.println("IO error...");
        }
        return lines;
    }

    /**
     * getInsultPart returnerar en av förolämpningarna i medskickad ArrayList
     *
     * @param part
     * @return
     */
    private String getInsultPart(ArrayList<String> part) {
        int insultNumber = r.nextInt(part.size());
        return part.get(insultNumber);
    }

    /**
     * insultMe skapar en förolämpning
     *
     * @return
     */
    public String insultMe() {
        String insult = "Thou " + getInsultPart(choice1) + " "
                + getInsultPart(choice2) + " " + getInsultPart(choice3) + "!";
        return insult;
    }

    /**
     * main-metoden skapar InsultFive-objekt.
     *
     * @param args
     */
    public static void main(String[] args) {
        InsultFive insult = new InsultFive();
        System.out.println(insult.insultMe());
    }
}
