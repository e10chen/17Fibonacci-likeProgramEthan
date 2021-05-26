package sample;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Fibonnacci sequence 1:");
        Fibonacci myFib = new MyFibonacci(7, 3, 8);
        myFib.run();
        System.out.println("Fibonnacci sequence 2:");
        Fibonacci myFib2 = new MyFibonacci(5, 2, 6);
        myFib2.run();
    }
}