/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsr42
 */
public class Flight {
    private String departure;
    private String destination;
    
    public Flight(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }
    
    public String getDeparture() {
        return this.departure;
    }
    
    public String getDestination() {
        return this.destination;
    }
}
