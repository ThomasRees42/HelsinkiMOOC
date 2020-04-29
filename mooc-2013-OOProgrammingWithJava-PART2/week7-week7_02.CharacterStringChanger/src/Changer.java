/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author tsr42
 */
public class Changer {
    
    private ArrayList<Change> changes = new ArrayList<Change>();
    
    public void addChange(Change change) {
        changes.add(change);
    }
    
    public String change(String characterString) {
        for (Change change : changes) {
            characterString = change.change(characterString);
        }
        return characterString;
    }
}