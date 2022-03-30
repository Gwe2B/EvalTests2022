package kata;


import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class BallTest {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {
        Duration timeout = Duration.ofSeconds(21);
        assertTimeout(timeout, () -> {
            Ball objectToTest = new Ball();
            objectToTest.roll();
        });
    }
}
