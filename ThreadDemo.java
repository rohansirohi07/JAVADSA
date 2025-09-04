// package oopswithjava;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd thread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Odd thread interrupted.");
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
    }
}