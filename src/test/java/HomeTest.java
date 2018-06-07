import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class HomeTest {

    @Test
    public void homeAssistantShouldTurnOnTheAC() {
        HomeAssistant pride = new HomeAssistant();
        pride.addCommand("Turn On AC", new TurnOnAC());
        pride.doOnCommand("Turn On AC");

        AC ac = new AC();

        assertTrue(ac.turn_on());
    }

    @Test
    public void homeAssistantShouldTurnOffTheAC() {
        HomeAssistant pride = new HomeAssistant();
        pride.addCommand("Turn Off AC", new TurnOnAC());
        pride.doOnCommand("Turn Off AC");

        AC ac = new AC();

        assertTrue(ac.turn_off());
    }
}

