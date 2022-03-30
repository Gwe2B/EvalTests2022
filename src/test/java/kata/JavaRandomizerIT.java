package kata;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.AssertionsForClassTypes;

public class JavaRandomizerIT {

    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        Between0And37Randomizer randomizer = new JavaRandomizer();
        AssertionsForClassTypes.assertThat(randomizer.getRouletteResult()).isBetween(0, 37);
    }

    @Test
    public void allNumbersOccur() throws Exception {
        // No idea...
        // Between0And37Randomizer randomizer = new JavaRandomizer();
        // AssertionsForClassTypes.assertThat(randomizer.getRouletteResult()).isIn();
    }


}
