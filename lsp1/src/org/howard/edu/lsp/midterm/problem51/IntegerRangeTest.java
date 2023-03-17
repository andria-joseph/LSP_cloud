package org.howard.edu.lsp.midterm.problem51;

import org.junit.Test;

public class IntegerRangeTest {
    private Range range1 = new IntegerRange(5, 10);
    private Range range2 = new IntegerRange(8, 15);
    private Range range3 = new IntegerRange(1, 1);

    @Test
    public void testContains() {
        assertTrue(range1.contains(5));
        assertTrue(range1.contains(10));
        assertTrue(range1.contains(7));
        assertFalse(range1.contains(4));
        assertFalse(range1.contains(11));
    }

    private void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testOverlaps() throws EmptyRangeException {
        assertTrue(range1.overlaps(range2));
        assertTrue(range2.overlaps(range1));
        assertTrue(range1.overlaps(range1));
        assertFalse(range1.overlaps(new IntegerRange(1, 4)));
        assertFalse(range1.overlaps(new IntegerRange(11, 15)));
        assertFalse(range1.overlaps(null));
    }

    @Test
    public void testSize() {
        assertEquals(6, range1.size());
        assertEquals(8, range2.size());
        assertEquals(1, range3.size());
    }
}

