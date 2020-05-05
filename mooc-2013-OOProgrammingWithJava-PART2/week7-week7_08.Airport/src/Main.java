
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner scanner = new Scanner(System.in);
        TextUserInterface screen = new TextUserInterface(scanner);
        screen.start();
    }
}
