package lldQuestions.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
    private static MyBlockingQueue<String> queue;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(14);
        MyBlockingQueue queue = new MyBlockingQueue(1);

        executorService.submit(() -> {
            try {
                queue.put("PRATIK");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(() -> {
            try {
                queue.put("RAM");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        executorService.submit(() -> {
            try {
                queue.put("SANKET");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        executorService.submit(() -> {
            try {
                queue.put("GOPAL");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(() -> {
            try {
                queue.put("ADITYA");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println("GOT FROM QUEUE: "+queue.take()+", "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println("GOT FROM QUEUE: "+queue.take()+", "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println("GOT FROM QUEUE: "+queue.take()+", "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

    }
}


class MyBlockingQueue<E> {
    //queue
    //lock
    //condition

    private Queue<E> queue;
    private int maxSize = 16;
    private ReentrantLock lock;
    private Condition notFull;
    private Condition notEmpty;

    public MyBlockingQueue(int size) {
        queue = new LinkedList<>();
        this.maxSize = size;
        lock = new ReentrantLock();
        notEmpty = lock.newCondition();
        notFull = lock.newCondition();
    }


    public void put(E e) throws InterruptedException {
        lock.lock();

        try {
            //produce add a element in queue
            while (queue.size() == maxSize) {
                System.out.println("THREAD WAITING TO ADD: " + Thread.currentThread().getName());
                notFull.await();
            }

            System.out.println("THREAD ACQUIRE LOCK TO ADD: "+e+",: " + Thread.currentThread().getName());
            queue.add(e);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public E take() throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == 0) {
                System.out.println("THREAD WAITING TO TAKE: " + Thread.currentThread().getName());
                notEmpty.await();
            }

            System.out.println("THREAD ACQUIRE LOCK TO TAKE: " + Thread.currentThread().getName());
            E e = queue.remove();
            notFull.signalAll();
            return e;

        } finally {
            lock.unlock();
        }
    }


}
