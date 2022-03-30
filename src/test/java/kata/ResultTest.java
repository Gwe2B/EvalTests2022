package kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        Result objectToTest = new Result(37);
        assertEquals("00", objectToTest.number);
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        // No idea...
    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        Result objectToTest_00 = new Result(37);
        Result objectToTest_0 = new Result(0);
        assertEquals(Result.Color.GREEN, objectToTest_00.color);
        assertEquals(Result.Color.GREEN, objectToTest_0.color);
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        int index = 1;

        while(index*2 < 37) {
                Result objectToTest = new Result(index*2);
                assertEquals(Result.Color.BLACK, objectToTest.color);
                index++;
        }
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        int index = 1;

        while(index < 37) {
                Result objectToTest = new Result(index);
                assertEquals(Result.Color.RED, objectToTest.color);
                index += 2;
        }
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
        throws Exception {
        assertThrows(RouletteException.class, () -> {
                new Result(40);
        });
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
        throws Exception {
        assertThrows(RouletteException.class, () -> {
                new Result(-10);
        });
    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {
        Result tmp = new Result(randomizerValue);
        assertEquals(expectedColor, tmp.color);
    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
        Result tmp = new Result(randomizerValue);
        assertEquals(expectedNumber, tmp.number);
    }
}