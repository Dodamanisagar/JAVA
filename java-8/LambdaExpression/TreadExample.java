package LambdaExpression;
/**without lambda expression
 class MyRunnable implements Runnable
{

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("child thread");
        }
    }
}
public class TreadExample {
    public static void main(String[] args) {
        Runnable r=new MyRunnable();
        Thread thread=new Thread(r);
        thread.start();

        for (int i = 0; i <5 ; i++) {
            System.out.println("main thread");
        }
    }
}*/

//with lambda expression
public class TreadExample {
    public static void main(String[] args) {
        Runnable r = ()->{
            for (int i = 0; i <5 ; i++) {
                System.out.println("child thread");
            }
        };

Thread thread=new Thread(r);
thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
