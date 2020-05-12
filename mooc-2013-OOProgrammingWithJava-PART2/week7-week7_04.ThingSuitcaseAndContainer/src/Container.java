
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
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container (int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    private int totalWeight() {
        int total = 0;
        
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        
        return total;
    }
    
    
    public String toString() {
        //"x suitcases (y kg)"
        String str = sizeString() + " (" + totalWeight() + " kg)";
        return str;
    }
    
    private String sizeString() {
        int size = suitcases.size();
        
        switch (size) {
            case 0:
                return "empty";
            case 1:
                return "1 suitcases";
            default:
                return size + " suitcases";
        }
    }
    
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
