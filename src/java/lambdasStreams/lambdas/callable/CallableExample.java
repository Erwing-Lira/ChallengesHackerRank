package java.lambdasStreams.lambdas.callable;

import java.util.concurrent.Callable;

/**
 * Callable
 * None param, but return one value and can throw an exception
 */
public class CallableExample {
    public static void main(String[] args) {
        Callable<String> callable = () -> {
            return "Hello world";
        };
        try {
            String res = callable.call();
            System.out.println(res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Callable<String> callableTwo = () -> "Hello world";
        try {
            String res = callableTwo.call();
            System.out.println(res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
