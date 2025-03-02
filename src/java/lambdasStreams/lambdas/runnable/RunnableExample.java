package java.lambdasStreams.lambdas.runnable;

/**
 * Runnable
 * None param, but does not return any value, just execute a task
 */
public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Executing a task...");
        };
        runnable.run();

        Runnable runnableTwo = () -> System.out.println("Executing a task Two...");
        runnableTwo.run();
    }
}
