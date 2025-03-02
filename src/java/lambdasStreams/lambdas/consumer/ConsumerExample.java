package java.lambdasStreams.lambdas.consumer;

import java.util.function.Consumer;

/**
 * Consumer
 * One param, but it does not return any value
 */
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (param) -> {
            System.out.println(param);
        };
        consumer.accept("Hi");

        Consumer<String> consumerTwo = (param) -> System.out.println(param);
        consumerTwo.accept("Hello");

        Consumer<String> consumerThree = System.out::println;
        consumerThree.accept("World");
    }
}
