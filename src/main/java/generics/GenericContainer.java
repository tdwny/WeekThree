package generics;

/**
 * This is a Generic Container Class to store a variable of any type and return it
 * @param <Type>
 */
public class GenericContainer<Type>{

    //Private Variables
    private final Type value;

    //Constructor
    public GenericContainer(Type value) {
        this.value = value;
    }

    //Getter
    public Type getValue() {
        return value;
    }

}
