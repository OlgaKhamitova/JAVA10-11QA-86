import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Radio;

public class RadioTest {
    @Test
    public void testShouldNotSetRadioStationNoAboveMax() {
        Radio radio = new Radio();
        radio.next();
        int expected = 1;
        int actual = radio.getCurrStationNo();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextIfCurrStationIsMax() {
        Radio radio = new Radio();
        int maxStationNumber = 9;
        for (int currStationNumber=0; currStationNumber <= maxStationNumber; currStationNumber++) {
            radio.next();
        }
        int expected =  0;
        int actual = radio.getCurrStationNo();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldNotSetRadioStationNoBelowMin() {
        Radio radio = new Radio();
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrStationNo();

        Assertions.assertEquals(expected, actual);
    }
@Test
public void testPrevIfCurrStationMoreThenMin() {
        Radio radio = new Radio();
        radio.next();
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrStationNo();

        Assertions.assertEquals(expected, actual);

}
    @Test
    public void testShouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseIfVolumeIsMax() {
        Radio radio = new Radio();
        int maxVolume = 100;
        for (int currVolume = 0; currVolume <= maxVolume; currVolume++ ) {
            radio.increaseVolume();
        }
        int expected = 100;
        int actual = radio.getCurrVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseIfVolumeIsMin() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrVolume();

        Assertions.assertEquals(expected, actual);
    }
}

