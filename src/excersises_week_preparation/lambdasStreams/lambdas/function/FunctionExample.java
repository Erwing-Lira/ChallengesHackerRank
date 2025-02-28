package excersises_week_preparation.lambdasStreams.lambdas.function;

import java.util.function.Function;

/**
 * Function
 * One param, return one value
 */
public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (a) -> {
            return a * a;
        };
        System.out.println(function.apply(2));

        Function<Integer, Integer> functionTwo = (a) -> a * a;
        System.out.println(functionTwo.apply(5));
    }
}
