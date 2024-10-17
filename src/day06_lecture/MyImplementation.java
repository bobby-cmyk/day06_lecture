package day06_lecture;

public class MyImplementation implements Runnable {

    private String name = "";

    public MyImplementation(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        RunningThreadCount();
    }

    public void RunningThreadCount() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s - Thread: %s\n", this.name,Thread.currentThread().getName());
        }
    }
    
}
