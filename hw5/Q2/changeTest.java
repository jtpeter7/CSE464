import static org.junit.Assert.*;

import org.junit.Test;


public class changeTest {
    @Test
    public void T1() {
        int[] expected = {0,0,0,0,0};
        assertArrayEquals( expected, change.changeCalc(100, 100));
    }
    @Test
    public void T2() {
        int[] expected = {0,0,0,0,0};
        assertArrayEquals( expected, change.changeCalc(100, 101));
    }
    @Test
    public void T3() {
        int[] expected = {2,0,0,0,1};
        assertArrayEquals( expected, change.changeCalc(100, 97.99));
    }
    @Test
    public void T4() {
        int[] expected = {49,1,1,1,2};
        assertArrayEquals(expected, change.changeCalc(100, 50.58));
    }
    @Test
    public void T5() {
            int[] expected = {2,1,2,0,2};
            assertArrayEquals( expected, change.changeCalc(100, 97.53));
    }
    @Test
    public void T6() {
        int[] expected = {1,1,1,1,1};
        assertArrayEquals( expected, change.changeCalc(100, 98.59));
    }

}