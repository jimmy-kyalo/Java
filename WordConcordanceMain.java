import java.io.*;
import java.util.*;

public class WordConcordanceMain {

    private static enum Response {
        YES, NO
    }

    private FileManager fileManager;
    private WordConcordance builder;
    private Scanner scanner;

    public static void main(String[] args) {
        WordConcordanceMain main = new WordConcordanceMain();
        main.start();
    }

    public WordConcordanceMain() {
        fileManager = new FileManager();
        builder = new WordConcordance();
        scanner = new Scanner(System.in);
    }

    private void start() {
        Response userReply;
        String document, wordList;
        while (true) {
            userReply = prompt("Run the program ? ");
            if (userReply == Response.NO)
                break;
            document = inputFile();
            wordList = build(document);
            saveFile(wordList);
        }
        System.out.println("Thank you for using the program.");
    }

    private String inputFile() {
        String doc = "";
        try {
            doc = fileManager.openFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error in opening file: " + e.getMessage());
        }
        System.out.println("Input Document:\n" + doc);
        return doc;
    }

    private void saveFile(String list) {
        try {
            fileManager.saveFile(list);
        } catch (IOException e) {
            System.out.println("Error in saving file: " + e.getMessage());
        }
    }

    private String build(String document) {
        String concordance;
        concordance = builder.build(document);
        return concordance;
    }

    private Response prompt(String question) {
        String input;
        Response response = Response.NO;
        System.out.println(question + "(Yes - y; No - no)");
        input = scanner.next();
        if (input.equalsIgnoreCase("Y")) {
            response = Response.YES;
        }
        return response;
    }
}