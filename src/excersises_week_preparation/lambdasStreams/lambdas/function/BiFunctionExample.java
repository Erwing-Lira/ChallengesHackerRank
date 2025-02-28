package excersises_week_preparation.lambdasStreams.lambdas.function;

import java.util.function.BiFunction;

/**
 * BiFunction
 * Two params, return one value
 */
public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> {
            return a + b;
        };
        System.out.println(biFunction.apply(1, 2));

        BiFunction<Integer, Integer, Integer> biFunctionTwo = (a, b) -> a + b;
        System.out.println(biFunctionTwo.apply(1, 2));
    }
}
