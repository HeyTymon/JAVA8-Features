package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        //Before Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        //Java 8

        new Thread(() -> System.out.println("Inside Runnable 2")).start();

    }
}
