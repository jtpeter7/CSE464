import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class windshieldWiperTest {

    private static windshieldWiper testCase;
    @BeforeClass
    public   static void setUpObjects()
    {
        testCase = new windshieldWiper(0, "OFF", 1);
    }


    @Test
    public void T1() {
        setUpObjects();
        try {
            testCase.senseDialUp();
            assertEquals("Result:", 0, testCase.getWiperSpeed());
        } catch (DialErrorException e) {
            fail("DialErrorException not expected");
        }
    }

    @Test
    public void T2() {
        setUpObjects();
        try {
            testCase.senseLeverUp();
            assertEquals("Result:", 4, testCase.getWiperSpeed());
        } catch (LeverErrorException e) {
            fail("LeverErrorException not expected");
        }
    }
    @Test
    public void T3() {
        setUpObjects();
        try {
            testCase.senseLeverUp();
            testCase.senseDialUp();
            assertEquals("Result:", 6, testCase.getWiperSpeed());
        } catch (DialErrorException | LeverErrorException e) {
            fail("LeverErrorException not expected");
        }
    }
    @Test
    public void T4() {
        setUpObjects();
        try {
            testCase.senseDialUp();
            testCase.senseDialUp();
            testCase.senseLeverUp();
            assertEquals("Result:", 12, testCase.getWiperSpeed());
        } catch (DialErrorException | LeverErrorException e) {
            fail("LeverErrorException not expected");
        }
    }
    @Test
    public void T5() {
        setUpObjects();
        try {
            testCase.senseLeverUp();
            testCase.senseLeverUp();
            assertEquals("Result:", 30, testCase.getWiperSpeed());
        } catch (LeverErrorException e) {
            fail("LeverErrorException not expected");
        }
    }
    @Test
    public void T6() {
        setUpObjects();
        try {
            testCase.senseLeverUp();
            testCase.senseLeverUp();
            testCase.senseLeverUp();
            assertEquals("Result:", 60, testCase.getWiperSpeed());
        } catch (LeverErrorException e) {
            fail("LeverErrorException not expected");
        }
    }
    @Test
    public void T7() {
        setUpObjects();
        try {
            testCase.senseLeverUp();
            testCase.senseLeverDown();
            assertEquals("Result:", 0, testCase.getWiperSpeed());
        } catch (LeverErrorException e) {
            fail("LeverErrorException not expected");
        }
    }
}