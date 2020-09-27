import functions.impl.Printer;
import generics.GenericContainer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class genericContainerTests {

    /**
     * Test String genericContainer with String
     */
    @Test
    public void genericContainerString(){
        GenericContainer genericContainer = new GenericContainer<String>("Test");
        String expectedValue = "Test";
        Object actualValue = genericContainer.getValue();
        assertTrue("Expected Value was " + expectedValue + " but was " + actualValue, actualValue == expectedValue);
    }

    /**
     * Test String genericContainer with Integer
     */
    @Test
    public void genericContainerInteger(){
        GenericContainer genericContainer = new GenericContainer<Integer>(123);
        Integer expectedValue = 123;
        Object actualValue = genericContainer.getValue();
        assertTrue("Expected Value was " + expectedValue + " but was " + actualValue, actualValue == expectedValue);
    }

    /**
     * Test String genericContainer with String
     */
    @Test
    public void genericContainerNull(){
        GenericContainer genericContainer = new GenericContainer<Integer>(null);
        Integer expectedValue = null;
        Object actualValue = genericContainer.getValue();
        assertTrue("Expected Value was " + expectedValue + " but was " + actualValue, actualValue == expectedValue);
    }


}
