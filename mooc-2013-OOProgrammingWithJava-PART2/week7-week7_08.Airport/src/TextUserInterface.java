
import java.util.ArrayList;
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
    private ArrayList<Plane> planes;
    
    public TextUserInterface(Scanner reader) {
        this.reader = reader;
        this.planes = new ArrayList<Plane>();
    }
    
    public void start() {
        airportPanel();
        flightService();
    }
    
    private void airportPanel() {
        String operation;
        
        System.out.println("Airport panel\n--------------------\n");
        while (true) {
            System.out.print("Choose operation:\n" +
                                "[1] Add airplane\n" +
                                "[2] Add flight\n" +
                                "[x] Exit\n" +
                                "> ");
            operation = reader.nextLine();
            
            if (operation.equals("1")) {
                addAirplane();
            }
            else if (operation.equals("2")) {
                addFlight();
            }
            else if (operation.equals("x")) {
                break;
            }
            else {
                System.out.println("Invalid operation!\n");
            } 
        }
    }
    
    private void addAirplane() {
        String id;
        int capacity;
        
        System.out.println("Give plane ID: ");
        id = reader.nextLine();
        System.out.println("Give plane capacity: ");
        capacity = reader.nextInt();
        
        Plane plane = new Plane(id, capacity);
        planes.add(plane);
    }
    
    private void addFlight() {
        String id;
        String departure;
        String destination;
        Plane plane;
        
        System.out.println("Give plane ID: ");
        id = reader.nextLine();
        System.out.println("Give plane departure code: ");
        departure = reader.nextLine();
        System.out.println("Give plane destination code: ");
        destination = reader.nextLine();
        
        plane = findPlane(id);
        
        if (plane != null) {
            plane.addFlight(departure, destination);
        }
        else {
            System.out.println("Invalid ID!\n");
        }
    }
    
    private Plane findPlane(String id) {
        for (Plane plane : planes) {
            if (id.equals(plane.getID())) {
                return plane;
            }
        }
        return null;
    }
    
    private void flightService() {
        String operation;
        
        System.out.println("Flight service\n--------------------\n");
    }
    
    
}
