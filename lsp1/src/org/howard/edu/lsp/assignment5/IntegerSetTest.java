package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment4.IntegerSet;

public class IntegerSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
	    @("Test case for add")
	    public void testEquals() {

			IntegerSet set1 = new IntegerSet();

	        // JUnit test case(s) for add()
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        System.out.println("Value of Set1 is: " + set1.toString());
		}
		@Test
	    @("Test case for smallest and largest")
	    public void testsmallandlarge() {
	        // JUnit test case(s)for smallest() and largest() methods
	        System.out.println("Smallest value in Set1 is: " + set1.smallest());
	        System.out.println("Largest value in Set1 is: " + set1.largest());

	        IntegerSet set2 = new IntegerSet();
		}
		@Test
	    @("Test case for add")
	    public void testadddup() {
	        // JUnit test case(s)for add() method with duplicate values
	        set2.add(4);
	        set2.add(4);
	        set2.add(5);
	        System.out.println("Value of Set2 is: " + set2.toString());
			}
		@Test
	    @("Test case for union")
	    public void testunion() {
	        // JUnit test case(s)for union() method
	        set1.union(set2);
	        System.out.println("Union of Set1 and Set2:");
	        System.out.println("Value of Set1 is: " + set1.toString());
	        System.out.println("Value of Set2 is: " + set2.toString());
		
	        @Test
		    @("Test case for intersect")
		    public void testintersect() {

	        // JUnit test case(s)for intersect() method
	        set1.intersect(set2);
	        System.out.println("Intersection of Set1 and Set2:");
	        System.out.println("Value of Set1 is: " + set1.toString());
	        System.out.println("Value of Set2 is: " + set2.toString());
	        }
	        
	        @Test
		    @("Test case for diff")
		    public void testdiff() {
	        // JUnit test case(s)for diff() method
	        IntegerSet set3 = new IntegerSet();
	        set3.add(3);
	        set3.add(4);
	        set3.add(5);
	        set1.diff(set3);
	        System.out.println("Set difference of Set1 and Set3:");
	        System.out.println("Value of Set1 is: " + set1.toString());
	        System.out.println("Value of Set3 is: " + set3.toString());
	        }
	        
	        @Test
		    @("Test case for remove")
		    public void testremove() {

	        // JUnit test case(s)for remove() method
	        set1.remove(2);
	        System.out.println("Set1 after removing 2:");
	        System.out.println("Value of Set1 is: " + set1.toString());
	        }
	        
	        @Test
		    @("Test case for clear")
		    public void testclear() {
	        // JUnit test case(s)for clear() method
	        set1.clear();
	        System.out.println("Set1 after clearing:");
	        System.out.println("Value of Set1 is: " + set1.toString());
	        }
	        
	        @Test
		    @("Test case for empty")
		    public void testempty() {
	        // JUnit test case(s)for isEmpty() method
	        System.out.println("Is Set1 empty? " + set1.isEmpty());
	        }
	    }

	}

}
