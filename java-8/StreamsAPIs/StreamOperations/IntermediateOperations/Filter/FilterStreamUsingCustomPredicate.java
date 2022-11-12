package StreamsAPIs.StreamOperations.IntermediateOperations.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**It uses Predicate class in place of the lambda expression, though both are the same things.

 Note that we can write any condition inside the predicate, to match the business requirements.*/

public class FilterStreamUsingCustomPredicate {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Predicate<Integer> condition=new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer n) {
                if(n%2==0)
                {
                    return true;
                }
                return false;
            }
        };
        list.stream().filter(condition).forEach(System.out::println);
    }
}
