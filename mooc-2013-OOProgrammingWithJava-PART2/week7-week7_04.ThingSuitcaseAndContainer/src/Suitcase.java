
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {        
        if (totalWeight() + thing.getWeight() <= this.maxWeight) {
            things.add(thing);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        
        for (Thing thing : things) {
            total += thing.getWeight();
        }
        
        return total;
    }
    
    public String toString() {
        //"x things (y kg)"
        String str = sizeString() + " (" + totalWeight() + " kg)";
        return str;
    }
    
    private String sizeString() {
        int size = things.size();
        
        switch (size) {
            case 0:
                return "empty";
            case 1:
                return "1 thing";
            default:
                return size + " things";
        }
    }
    
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }
    
    public Thing heaviestThing() {
        int heaviest = 0;
        Thing heaviestThing = null;
        
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest) {
                heaviest = thing.getWeight();
                heaviestThing = thing;
            }
        }
        
        return heaviestThing;
    }
}
