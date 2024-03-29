package ru.alexpvl;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {
    private int i;
    public void doCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1" -> color = ThreadColor.ANSI_CYAN;
            case "Thread 2" -> color = ThreadColor.ANSI_PURPLE;
            default -> color = ThreadColor.ANSI_GREEN;
        }

        synchronized (this) {
            for(i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }
}

class CountdownThread extends Thread {
    public Countdown threadCountdown;

    public CountdownThread(Countdown threadCountdown) {
        this.threadCountdown = threadCountdown;
    }

    @Override
    public void run() {
        threadCountdown.doCountdown();
    }
}