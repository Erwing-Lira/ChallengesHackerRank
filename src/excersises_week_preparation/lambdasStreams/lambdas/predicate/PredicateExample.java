package excersises_week_preparation.lambdasStreams.lambdas.predicate;

import java.util.function.Predicate;

/**
 * Predicate
 * One param, return boolean (true | false)
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = (str) -> {
            return str.length() > 5;
        };
        System.out.println(predicate.test("Hola Mundo"));

        Predicate<String> predicateTwo = (str) -> str.length() > 5;
        System.out.println(predicateTwo.test("Hola"));
    }
}
