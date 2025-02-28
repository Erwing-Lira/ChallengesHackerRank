package excersises_week_preparation.lambdasStreams.lambdas.consumer;

import java.util.function.BiConsumer;

/**
 * BiConsumer
 * Two params, but it does not return any value
 */
public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + ", b: " + b);
        };
        biConsumer.accept("Hello", "World");

        BiConsumer<String, String> biConsumerTwo = (a, b) -> System.out.println("a: " + a + ", b: " + b);
        biConsumerTwo.accept("Hello", "World");
    }
}
