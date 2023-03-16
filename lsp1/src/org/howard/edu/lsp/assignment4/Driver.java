package org.howard.edu.lsp.assignment4;
/**
 * 
 * @author Andria Joseph
 *
 */
public class Driver {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();

        // Test add() method
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Value of Set1 is: " + set1.toString());

        // Test smallest() and largest() methods
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        IntegerSet set2 = new IntegerSet();

        // Test add() method with duplicate values
        set2.add(4);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set2 is: " + set2.toString());

        // Test union() method
        set1.union(set2);
        System.out.println("Union of Set1 and Set2:");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());

        // Test intersect() method
        set1.intersect(set2);
        System.out.println("Intersection of Set1 and Set2:");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());

        // Test diff() method
        IntegerSet set3 = new IntegerSet();
        set3.add(3);
        set3.add(4);
        set3.add(5);
        set1.diff(set3);
        System.out.println("Set difference of Set1 and Set3:");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set3 is: " + set3.toString());

        // Test remove() method
        set1.remove(2);
        System.out.println("Set1 after removing 2:");
        System.out.println("Value of Set1 is: " + set1.toString());

        // Test clear() method
        set1.clear();
        System.out.println("Set1 after clearing:");
        System.out.println("Value of Set1 is: " + set1.toString());

        // Test isEmpty() method
        System.out.println("Is Set1 empty? " + set1.isEmpty());
    }
}
