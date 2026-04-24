package org.APCSLowell;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class RandomStringChooserTest {
    @Test
    public void randomStringChooserTest() {
        List<String> test = new ArrayList<>();
        String[] wordArray = { "wheels", "on", "the", "bus" };
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            test.add(sChooser.getNext());
        }
        assertEquals(6, test.size());
        assertEquals("NONE", test.get(4));
        assertEquals("NONE", test.get(5));
        assertEquals(true, test.contains("wheels"));
        assertEquals(true, test.contains("on"));
        assertEquals(true, test.contains("the"));
        assertEquals(true, test.contains("bus"));
    }
}
