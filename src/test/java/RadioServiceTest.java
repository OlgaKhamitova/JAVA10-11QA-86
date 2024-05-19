import org.example.RadioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void shouldNotSetRadioStationNoAboveMax() {
        RadioService radio = new RadioService();
        radio.next();
        int expected = 1;
        int actual = radio.getCurrStationNo();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNoBelowMin() {
        RadioService radio = new RadioService();
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrStationNo();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        RadioService radio = new RadioService();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        RadioService radio = new RadioService();
        radio.demotionVolume();
        int expected = 0;
        int actual = radio.getCurrVolume();

        Assertions.assertEquals(expected, actual);
    }
}

