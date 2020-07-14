import static org.junit.Assert.*;

import org.junit.Test;


public class changeTest {
    @Test
    public void T1() {
        int[] input = {8,6,7,5};
        int[] expected = {5,6,7,8};
        assertArrayEquals( expected, change.bubbleSortEfficient(input, 4));
    }
    @Test
    public void T2() {
        int[] input = {6,5,4};
        int[] expected = {6,5,4};
        assertArrayEquals( expected, change.bubbleSortEfficient(input, 0));
    }
    @Test
    public void T3() {
        int[] input = {1};
        int[] expected = {1};
        assertArrayEquals( expected, change.bubbleSortEfficient(input, 1));
    }

}