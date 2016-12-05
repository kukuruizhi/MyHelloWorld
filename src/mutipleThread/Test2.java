package src.mutipleThread;

public class Test2 {
	public static void main(String[] args) {
        NumThread1 n=new NumThread1();
        BigCharThread b=new BigCharThread(n);
        SmallCharThread s=new SmallCharThread(b);
        n.start();
        s.start();
        b.start();
    }
}

class NumThread1 extends Thread {
    
    public void run() {
        for(int i=1;i<=26;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
 
class BigCharThread extends Thread{
    private Thread person;
    public BigCharThread(Thread person) {
        this.person=person;
    }
    public void run() {
        try {
            person.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i='A';i<='Z';i++){
            System.out.println((char)i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
 
class SmallCharThread extends Thread{
    private Thread person;
    public SmallCharThread(Thread person) {
        this.person=person;
    }
    public void run() {
        try {
            person.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
                for(int i='a';i<='z';i++){
            System.out.println((char)i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}