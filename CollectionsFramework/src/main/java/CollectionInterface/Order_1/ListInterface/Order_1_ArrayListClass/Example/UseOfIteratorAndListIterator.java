package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIteratorAndListIterator {
    /**Consider the following example, where we remove elements from the ArrayList using iterator.remove() method while traversing through it -
     * The iterator() and listIterator() methods are useful when you need to modify the ArrayList while traversing.*/
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);

        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            Integer num = numbersIterator.next();
            if(num % 2 != 0) {
                numbersIterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
