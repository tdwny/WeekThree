import generics.GenericContainer;
import generics.GenericHashMap;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class genericHashMapTests {

    /**
     * Test String genericContainer with Integer Key and String Value
      */
    @Test
    public void genericHashMapTestIntegerString(){
        GenericHashMap genericHashMap = new GenericHashMap<Integer, String>(new HashMap());
        genericHashMap.getHashMap().put(1, "First");
        genericHashMap.getHashMap().put(2, "Second");

        String expectedValue = "First";
        Object actualValue = genericHashMap.getHashMap().get(1);
        assertTrue("Expected Value was " + expectedValue + " but was " + actualValue, actualValue == expectedValue);
    }

    /**
     * Test String genericContainer with String Key and Integer Value
     */
    @Test
    public void genericHashMapTestStringInteger(){
        GenericHashMap genericHashMap = new GenericHashMap<String, Integer>(new HashMap());
        genericHashMap.getHashMap().put("First", 1);
        genericHashMap.getHashMap().put("Second", 2);

        Integer expectedValue = 2;
        Object actualValue = genericHashMap.getHashMap().get("Second");
        assertTrue("Expected Value was " + expectedValue + " but was " + actualValue, actualValue == expectedValue);
    }

}