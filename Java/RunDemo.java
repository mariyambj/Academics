import java.*;
class Multiplication implements Runnable
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("5 * "+i+" = "+5*i);
            try
            {
                
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();

            }
        }
    }
}
class Factor implements Runnable
{
    @Override
    public void run()
    {
        int a=36;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println("\t" + i + " is a factor of "+a);
                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
    }
}
}

class RunDemo
{
    public static void main(String []arg)
    {
        Multiplication m=new Multiplication();
        Factor f=new Factor();
        Thread t1=new Thread(m);
        Thread t2=new Thread(f);
        t1.start();
        t2.start();
    }
}








/*class Mul implements Runnable {
    @Override
    public void run() {
        System.out.println("Multiplication Table: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t5 * " + i + " = " + (5 * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Fact implements Runnable {
    @Override
    public void run() {
        System.out.println("Factors of 36: ");
        for (int i = 1; i <= 36; i++) {
            if (36 % i == 0) {
                System.out.println("F(36): " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Mul());
        Thread t2 = new Thread(new Fact());
        t1.start();
        t2.start();
    }
}
*/