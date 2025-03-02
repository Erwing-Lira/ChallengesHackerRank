package java.lambdasStreams.lambdas.predicate;

import java.util.function.BiPredicate;

/**
 * BiPredicate
 * Two params, return boolean (true | false)
 */
public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
            return a > b;
        };
        System.out.println(biPredicate.test(1, 2));

        BiPredicate<Integer, Integer> biPredicateTwo = (a, b) -> a > b;
        System.out.println(biPredicateTwo.test(2, 1));
    }
}
