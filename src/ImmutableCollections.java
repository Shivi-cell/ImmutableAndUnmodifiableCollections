// An object is considered immutable if its state cannot change after it is constructed.
// After you create an immutable instance of a collection,
// it holds the same data as long as a reference to it exists.

// Immutable collection is came in java 9 (java 8 -> unmodifiable collections)
// static factory methods for the immutability

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<String> strings = List.of("hello ","I ", "am ", "immutable");
        System.out.println(strings);

        // performing an operation on immutable object
        // strings.add("new element"); // java.lang.UnsupportedOperationException

        //List<String> stringList = List.of(null); // java.lang.NullPointerException

        Set<Integer> numbers = Set.of(101,219,213);
        System.out.println(numbers);

        //Set<Integer> numbers2 = Set.of(101,219,101); // IllegalArgumentException because of duplicate element in the set
        //Set<Integer> numbers3 = Set.of(null); // java.lang.NullPointerException


        Map<Integer,String> integerStringMap = Map.of(101,"Hello", 131,"Shivi");
        System.out.println(integerStringMap);

        //Map<Integer,String> integerStringMap1 = Map.of(101,null, 131,"Shivi"); // java.lang.NullPointerException

    }
}
