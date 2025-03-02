package java.tuplas;

import kotlin.Pair;
import kotlin.Triple;

public class Example {
    public static void main(String[] args) {
        Task task = new Task();

        Pair<String, Integer> pair = task.returningPair();
        System.out.println("PAIR");
        System.out.println("Param 1: " + pair.component1());
        System.out.println("Param 2: " + pair.component2());

        Triple<String, Integer, Boolean> triple = task.returningTriple();
        System.out.println("TRIPLE");
        System.out.println("Param 1: " + triple.component1());
        System.out.println("Param 2: " + triple.component2());
        System.out.println("Param 3: " + triple.component3());
    }
}
