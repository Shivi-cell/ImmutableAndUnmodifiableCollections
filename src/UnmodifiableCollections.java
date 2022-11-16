//If you create a List and pass it to the Collections.unmodifiableList method, then you get an unmodifiable view.
// The underlying list is still modifiable,
// and modifications to it are visible through the List that is returned, so it is not actually immutable.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// unmodifiable collections are came in java 8 Collections.unmodifiable...()
public class UnmodifiableCollections {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println("original list is ");
        System.out.println(integerList);

        // making an unmodifiable List
        // direct modification on unmodifiableList is not allowed
        List<Integer> unmodifiableList = Collections.unmodifiableList(integerList);
        System.out.println("unmodifiableList list is ");
        System.out.println(unmodifiableList);
        //unmodifiableList.add(6); // java.lang.UnsupportedOperationException


        // we have an unmodifiable List but still the underlying data structure is modifiable
        // lets see
        integerList.add(6);
        System.out.println("original list after modification ");
        System.out.println(integerList);

        // if we change our original list then the unmodifiableList is also modified internally lets see
        System.out.println("unmodifiableList list after original list is modified is ");
        System.out.println(unmodifiableList);

        // so it is not purely immutable collections that's why immutable collections concept came in java 8

    }
}
