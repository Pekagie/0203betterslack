public class ThreadClass1 implements Runnable {

    private final String name;

    public ThreadClass1(String name) {
        this.name = name;
    }
    public void run() {
        while (true) {
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);
            System.out.println("Hello from " + name);

        }
    }
}
