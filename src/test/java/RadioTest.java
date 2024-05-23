import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Radio;

public class RadioTest {

    @Test
    public void test_Next_Set_CurrentStation_To_Next_Value() {
        Radio radio = new Radio();
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_Next_If_CurrentStation_Is_Max() {
        Radio radio = new Radio();
        int maxStationNumber = 9;
        radio.setCurrentStationNumber(maxStationNumber);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_Next_If_CurrentStation_Above_Max() {
        Radio radio = new Radio();
        int currStationNumber = 9;
        radio.setCurrentStationNumber(currStationNumber);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_Set_Prev_If_CurrentStation_Below_Min() {
        Radio radio = new Radio();
        int currStationNumber = 0;
        radio.setCurrentStationNumber(currStationNumber);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_Prev_If_CurrentStation_Is_Min() {
        Radio radio = new Radio();
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_Prev_If_CurrentStation_Is_More_Then_Min() {
        Radio radio = new Radio();
        radio.next();
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test_IncreaseVolume_Set_CurrentVolume_To_NextValue() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_IncreaseVolume_If_Volume_Is_Max() {
        Radio radio = new Radio();
        int maxVolume = 100;
        radio.setCurrentVolume(maxVolume);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_DecreaseVolume_If_Volume_Is_Min() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_DecreaseVolume_If_Volume_Is_More_Then_Min() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_SetVolume_Above_Max() {
        Radio radio = new Radio();
        int maxVolume = 100;
        radio.setCurrentVolume(maxVolume + 1);
        int expected = 0; //если 100, то падает
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test_SetVolume_Below_Min() {
        Radio radio = new Radio();
        int minVolume = 0;
        radio.setCurrentVolume(minVolume - 1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_SetVolume_In_Allowed_Range() {
        Radio radio = new Radio();
        int currentVolume = 50;
        radio.setCurrentVolume(currentVolume + 1);
        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_SetRadioStation_Above_Max() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentStationNumber(currentRadioStation + 1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_SetRadioStation_Below_Min() {
        Radio radio = new Radio();
        int currentRadioStation = 0;
        radio.setCurrentStationNumber(currentRadioStation - 1);
        int expected = 0; //если 9, то падает
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_SetRadioStation_In_Allowed_Range() {
        Radio radio = new Radio();
        int currentRadioStation = 5;
        radio.setCurrentStationNumber(currentRadioStation + 1);
        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_Constructor_RadioStation_Max() {
        int maxStationNumber = 14;
        int stationCount = 15;
        Radio radio = new Radio(stationCount);
        radio.setCurrentStationNumber(stationCount - 2);
        radio.next();
        int expected = maxStationNumber;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_Constructor_RadioStation_AboveMax() {
        int stationCount = 15;
        Radio radio = new Radio(stationCount);
        radio.setCurrentStationNumber(stationCount - 1);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_Constructor_Prev_If_CurrentStation_InAllowedRange() {
        int stationCount = 15;
        int currentStationNumber = 14;
        Radio radio = new Radio(stationCount);
        radio.setCurrentStationNumber(currentStationNumber);
        radio.prev();
        int expected = 13;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_Constructor_Prev_If_CurrentStation_BelowMin() {
        int stationCount = 11;
        int currentStationNumber = 0;
        Radio radio = new Radio(stationCount);
        radio.setCurrentStationNumber(currentStationNumber);
        radio.prev();
        int expected = 10;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}

