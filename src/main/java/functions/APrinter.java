package functions;

public interface APrinter {
    /**
     * All implementations of APrinter must contain a printArray method
     * @param array
     * @param <Type>
     */
    static <Type> void printArray(Type[] array) {}
}
