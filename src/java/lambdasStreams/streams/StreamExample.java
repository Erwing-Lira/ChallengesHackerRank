package java.lambdasStreams.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Stream
 */
public class StreamExample {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Erwing", "Julio", "Erendira", "Fernando");

        // filer -> filter the list which complain the validation
        /*nameList.stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);*/

        // map -> transform the value applying a function
        /*nameList.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);*/
        /*nameList.stream()
                .map(String::toUpperCase)
                .filter(name -> name.startsWith("E"))
                .forEach(System.out::println);*/

        // sorted -> sort the elements
        /*nameList.stream()
                .sorted()
                .forEach(System.out::println);*/

        // deduce -> combine all the elements into one value
        /*String res = nameList.stream()
                .reduce("", (a, b) -> a.concat(" " +b));
        System.out.println(res);*/

        // collect -> collect all the elements in the list return another list
        /*List<String> newList = nameList.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(newList);*/

        // distinct -> delete duplicated values
        /*List<String> nameListDuplicated = Arrays.asList("Erwing", "Julio", "Erendira", "Fernando", "Julio");
        nameListDuplicated.stream()
                .distinct()
                .forEach(System.out::println);*/

        // limit -> limit the number of values that will be processed
        /*nameList.stream()
                .limit(3)
                .forEach(System.out::println);*/

        // skip -> Skip a specific number
        /*nameList.stream()
                .skip(3)
                .forEach(System.out::println);*/

        // anyMatch -> Verified if one value matches the condition
        /*boolean res = nameList.stream()
                .anyMatch(name -> name.startsWith("J") );
        System.out.println(res);*/

        // allMatch -> Verified that all element matches the condition
        /*boolean res = nameList.stream()
                .allMatch(name -> name.startsWith("E"));
        System.out.println(res);*/

        // noneMatch -> verified that any element matches the condition
        /*boolean res = nameList.stream()
                .noneMatch(name -> name.startsWith("X"));
        System.out.println(res);*/

        // flatMap ->
        /*List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(2, 4, 5),
                Arrays.asList(5, 6, 7, 8)
        );
        List<Integer> list = listOfLists.stream()
                .flatMap(numberList -> numberList.stream())
                .toList();
        System.out.println(list);*/
    }
}
