/* Prior to Java 10, you could create unmodifiable Collections via the Collections class
   The Collections.unmodifiableList method returns an unmodifiable view of the source List.
   So if the source List is modified, these changes are reflected in the unmodifiable List.
   The copyOf methods on the other hand, return a read-only copy of the source Collection.
   So even if the source Collection is modified, the unmodifiable Collection does not change. */

import java.util.ArrayList;
import java.util.List;

public class CopyOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        System.out.println("original list");
        System.out.println(integers);

        // copying the integers arraylist
        List<Integer> copy = List.copyOf(integers);
        System.out.println("copy of original list");
        System.out.println(copy);

        // performing an operation
        //copy.add(6); // java.lang.UnsupportedOperationException

        // modifying the original list
        integers.add(6);
        System.out.println("modified list");
        System.out.println(integers);
        System.out.println("after modified list the copy remains same");
        System.out.println(copy);
    }
}
