/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsr42
 */
public class Calculator {
    
    private Reader reader = new Reader();
    private int calculations = 0;

    public void start() {        
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }
        }

        statistics();
    }
    
    private void sum() {
        int sum;
        
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        sum = value1 + value2;
        System.out.println("sum of the values " + sum + "\n\n");
    }
    
    private void difference() {
        int difference;
        
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        difference = value1 - value2;
        System.out.println("difference of the values " + difference + "\n\n");
    }
    
    private void product() {
        int product;
        
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        product = value1 * value2;
        System.out.println("product of the values " + product + "\n\n");
    }
    
    private void statistics() {
        System.out.println("Calculations done " + calculations);
    }
}
