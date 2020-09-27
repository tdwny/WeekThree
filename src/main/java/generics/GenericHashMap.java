package generics;

import java.util.HashMap;

/**
 * This is a Generic HashMap class. It can store any type of key/value pairs in a Hashmap and return it
 * @param <MapKey>
 * @param <MapValue>
 */
public class GenericHashMap<MapKey, MapValue> {

    //Private Variables
    private HashMap<MapKey ,MapValue> hashMap;

    //Constructor
    public GenericHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    //Getter
    public HashMap<MapKey, MapValue> getHashMap() {
        return hashMap;
    }

}
