
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsr42
 */
public class Plane {
    private String id;
    private int capacity;
    private ArrayList<Flight> flights;
    
    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.flights = new ArrayList<Flight>();
    }    
    
    public String getID() {
        return this.id;
    } 
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public void addFlight(String departure, String destination) {
        Flight flight = new Flight(departure, destination);
        flights.add(flight);
    }
    
    public ArrayList<Flight> getFlights() {
        return this.flights;
    }
}
