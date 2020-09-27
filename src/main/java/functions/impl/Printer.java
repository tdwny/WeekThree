package functions.impl;

import functions.APrinter;

public class Printer implements APrinter {

    /**
     * printArray takes in a generic array and prints each element of the array
     * @param array
     * @param <Type>
     */
    public static <Type> void printArray(Type[] array){
        for (Type value : array){
            System.out.println(value.toString());
        }
    }

}
