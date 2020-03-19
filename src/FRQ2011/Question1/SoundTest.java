package FRQ2011.Question1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SoundTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void limitAmplitude() {
        Sound sound = new Sound(new int[]{40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223});
        int result = sound.limitAmplitude(2000);
        int[] newSample = sound.getSamples();
        assertEquals(5, result);
        assertEquals(2000, newSample[1]);
    }

    @Test
    public void trimSilenceFromBeginning() {
        Sound sound = new Sound(new int[]{0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0});
        sound.trimSilenceFromBeginning();
        int[] newSample = sound.getSamples();
        assertEquals(-14, newSample[0]);
    }
}