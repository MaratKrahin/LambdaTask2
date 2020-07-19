package LambdaTask2;

public class Worker {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener error;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener error) {
        this.callback = callback;
        this.error = error;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                error.onError("error! 33 doesn't work!");
                continue;
            }
            callback.onDone("Task " + i + " is done");

        }
    }

}
