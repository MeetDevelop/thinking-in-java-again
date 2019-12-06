package cn.meetdevelop;

/**
 * @author zgy
 * @DATE 2019/12/4 - 16:16
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(ThreadDemo::sayHello);
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getName());
    }

    private static void sayHello() {
        System.out.printf("线程 [ID : %s] : Hello World \n",Thread.currentThread().getId());
    }
}
