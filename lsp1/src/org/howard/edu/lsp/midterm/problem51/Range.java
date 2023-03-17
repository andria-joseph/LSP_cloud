package org.howard.edu.lsp.midterm.problem51;

import java.util;
public interface Range { 
    boolean contains(int value);  
    boolean overlaps(Range other) throws EmptyRangeException; 
    int size(); 
}

public class IntegerRange implements Range {
    private int lower;
    private int upper;

    IntegerRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    public boolean contains(int value) {
        return (value >= lower && value <= upper);
    }

    public boolean overlaps(Range other) throws EmptyRangeException {
        if (other == null) {
            throw new EmptyRangeException("Cannot pass null Range object.");
        }
        return (lower <= other.getUpper() && other.getLower() <= upper);
    }

    public int size() {
        return (upper - lower + 1);
    }
}


	}

}
