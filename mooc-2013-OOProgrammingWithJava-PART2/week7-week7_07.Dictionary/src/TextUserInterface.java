
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsr42
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    private final String language = "Finnish";
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        String command;
        
        System.out.println("Statements:\n" +
                           "  add - adds a word pair to the dictionary\n" +
                           "  translate - asks a word and prints its translation\n" +
                           "  quit - quits the text user interface\n");
        while (true) {
            System.out.print("Statement: ");
            command = reader.nextLine();
            
            if (command.equals("quit")) {
                System.out.println("Cheers!\n");
                break;
            }
            else if (command.equals("add")) {            
                add();
            }
            else if (command.equals("translate")) {
                translate();
            }
            else {
                System.out.println("Unknown statement\n");
            }
        }
    }
    
    private void add() {
        String word;
        String translation;
        
        System.out.print("In " + language + ": ");
        word = reader.nextLine();
        System.out.print("Translation: ");
        translation = reader.nextLine();
        
        dictionary.add(word, translation);
        
        System.out.println("");
    }
    
    private void translate() {
        String word;
        String translation;
        
        System.out.print("Give a word: ");
        word = reader.nextLine();
        
        translation = dictionary.translate(word);
        System.out.println("Translation: " + translation + "\n");
    }
}
