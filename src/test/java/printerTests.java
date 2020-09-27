
import functions.impl.Printer;
import org.junit.Test;

public class printerTests {

    /**
     * Test String Array
     */
    @Test
    public void printArrayTestString(){
        String[] stringArray = {"First", "Second", "Third"};
        Printer.printArray(stringArray);
    }

    /**
     * Test String Array
     */
    @Test
    public void printArrayTestInteger(){
        Integer[] integerArray = {1, 2, 3};
        Printer.printArray(integerArray);
    }

    /**
     * Test null Array
     */
    @Test
    public void printArrayTestNull(){
        Integer[] integerArray =  null;
    }

}