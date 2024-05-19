import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Radio;

public class RadioTest {
    @Test
    public void shouldNotSetRadioStationNoAboveMax() {
        Radio radio = new Radio();
        radio.next();
        int expected = 1;
        int actual = radio.getCurrStationNo();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNoBelowMin() {
        Radio radio = new Radio();
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrStationNo();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.demotionVolume();
        int expected = 0;
        int actual = radio.getCurrVolume();

        Assertions.assertEquals(expected, actual);
    }
}

