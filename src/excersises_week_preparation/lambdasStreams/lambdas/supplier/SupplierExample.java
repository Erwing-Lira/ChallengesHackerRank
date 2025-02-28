package excersises_week_preparation.lambdasStreams.lambdas.supplier;

import java.util.function.Supplier;

/**
 * Supplier
 * None param, but return one value
 */
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "Hello World";
        };
        System.out.println(supplier.get());

        Supplier<String> supplierTwo = () -> "Hello World";
        System.out.println(supplierTwo.get());
    }
}
