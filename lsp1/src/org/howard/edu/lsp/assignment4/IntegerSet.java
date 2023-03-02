package org.howard.edu.lsp.assignment4;
/**
 * 
 * @author Andria Joseph
 *
 */
import java.util.ArrayList;
import java.util.List;

//This class creates a set of unique Integers and is implemented using an ArrayList
public class IntegerSet {
    //Set of integers to be stored in an ArrayList
    private List<Integer> set = new ArrayList<Integer>();
    //Constructor
    public IntegerSet() {
    }
    
    //Clears the list of all values
    public void clear() {
        set.clear();
    }
    
    //Returns the amount of integers stored in the list
    public int length() {
        return set.size();
    }

    //Compares two IntegerSets to determine if they contain the same values in any order
    public boolean equals(IntegerSet b) {
        if (set.size() != b.length()) {
            return false;
        }
        for (int i = 0; i < set.size(); i++) {
            if (!b.contains(set.get(i))) {
                return false;
            }
        }
        return true;
    }

    //Checks if an integer is in the set
    public boolean contains(int value) {
        return set.contains(value);
    }

    //Returns the largest integer in the set and throws an exception if the set is empty
    public int largest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) > max) {
                max = set.get(i);
            }
        }
        return max;
    }

    //Returns the smallest integer in the set and throws an exception if the set is empty
    public int smallest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) < min) {
                min = set.get(i);
            }
        }
        return min;
    }

    //Add values to the set
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    //Removes a value from the set
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    //Joins two IntegerSets
    public void union(IntegerSet intSetb) {
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    //Gives the common values of two sets
    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<Integer>();
        for (int i = 0; i < set.size(); i++) {
            int item = set.get(i);
            if (intSetb.contains(item)) {
                intersection.add(item);
            }
        }
        set = intersection;
    }

    //Gives the values that are different between two sets
    public void diff(IntegerSet intSetb) {
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            set.remove(Integer.valueOf(item));
        }
    }

    //Checks if the set is empty
    public boolean isEmpty() {
        return set.isEmpty();
    }

    //Returns all the values in the set
    public String toString() {
        return set.toString();
    }
}

//Exception to be thrown
class IntegerSetException extends RuntimeException {
    public IntegerSetException(String message) {
        super(message);
    }
}