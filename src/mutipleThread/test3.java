package src.mutipleThread;

public class test3 {
	
    public static void main(String args[]) {

        Thread t = new Thread() {

            public void run() {
                pong();
            }
        };

       
        System.out.print("ping");
        t.run();
    }

    static void pong() {

        System.out.print("pong");

    }

}
