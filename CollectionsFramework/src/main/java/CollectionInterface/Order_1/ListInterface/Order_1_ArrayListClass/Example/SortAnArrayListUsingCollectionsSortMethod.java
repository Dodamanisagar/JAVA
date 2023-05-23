package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface SortAnArrayListUsingCollectionsSortMethod {
    /**Sort an ArrayList using Collections.sort() method.*/
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before : " + numbers);

        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(numbers);

        System.out.println("After : " + numbers);
    }
}
