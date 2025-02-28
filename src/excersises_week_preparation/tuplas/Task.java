package excersises_week_preparation.tuplas;

import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;

public class Task {
    // Pair -> return two values
    public Pair<String, Integer> returningPair() {
        return new Pair<>("Hello", 10);
    }

    // Tripe -> return three values
    public Triple<String, Integer, Boolean> returningTriple() {
        return new Triple<>("Hello", 10, true);
    }
}
