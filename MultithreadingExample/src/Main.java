public class Main {

    public static void main(String args[]) {
        ThreadExample T1 = new ThreadExample("Thread-1");
        T1.start();

        ThreadExample T2 = new ThreadExample("Thread-2");
        T2.start();
    }
}
