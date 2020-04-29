/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author tsr42
 */
public class Reader {
    private Scanner scanner;
    
    public Reader() {
        this.scanner = new Scanner(System.in);
    }
    
    public String readString() {
        return this.scanner.nextLine();
    }
    
    public int readInteger() {
        String str = this.scanner.nextLine();
        return Integer.parseInt(str);
    }
}
