import static org.junit.Assert.*;

import org.junit.Test;


public class changeTest {
    @Test
    public void T1() {
        assertEquals( 50, change.calcRate());//all 10
    }

    @Test
    public void T2() {
        assertEquals( 25, change.calcRate());//all -1,25,all 5s
    }

}