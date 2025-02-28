package excersises_week_preparation.lambdasStreams.lambdas.unary;

import java.util.function.UnaryOperator;

/**
 * UnaryOperator
 * One param, return one value of the same type
 */
public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (a) -> {
            return a * a;
        };
        System.out.println(unaryOperator.apply(5));

        UnaryOperator<Integer> unaryOperatorTwo = (a) -> a * a;
        System.out.println(unaryOperatorTwo.apply(2));
    }
}
