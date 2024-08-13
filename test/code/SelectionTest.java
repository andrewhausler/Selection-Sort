package code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tests The Output Of Running The Selection Sort Method
 */
public class SelectionTest {
    
    @Test
    public void testSelectionSort()
    {
        SelectionSort<Integer> mySort = new SelectionSort<Integer>(new ArrayList<Integer>(Arrays.asList(10, 4, 2, 6, 1, 8)));
        ArrayList<Integer> expectedArray = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 6, 8, 10));
        mySort.sort();
        assertEquals(expectedArray, mySort.getArray());
    }
}
