
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
        printWithSmileys("Mikael");
        printWithSmileys("\\:D/");
        printWithSmileys(".87");
    }
    
        private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        boolean even = (length % 2 == 0);
        printLine(length, even);
        printMiddle(characterString, even);
        printLine(length,even);
    }
    
    public static void printLine(int length, boolean even) {
        printSmileys(4);
        if (even == true) {
            printSmileys(length);
        }
        else {
            printSmileys(length+1);
        }
        printSmileys(2);
        System.out.print("\n");
    }
    
    public static void printMiddle(String str, boolean even) {
        printSmileys(2);
        if (even == true) {
            System.out.print(" " + str + " ");
        }
        else {
            System.out.print(" " + str + "  ");
        }
        printSmileys(2);
        System.out.print("\n");
    }
    
    public static void printSmileys(int times) {
        for (int i = 0; i < (times / 2); i++) {
            System.out.print(":)");
        }
    }

}
