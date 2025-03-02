package java.lambdasStreams.lambdas.binary;

import java.util.function.BinaryOperator;

/**
 * BinaryOperator
 * Two params of same type, return one value of the same value
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            return a * b;
        };
        System.out.println(binaryOperator.apply(2,3));

        BinaryOperator<Integer> binaryOperatorTwo = (a, b) -> a * b;
        System.out.println(binaryOperatorTwo.apply(1,3));
    }
}
