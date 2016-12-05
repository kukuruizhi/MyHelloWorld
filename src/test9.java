package src;


public class test9 {
	
	public static void main(String[] args){
        while(true){
        	new Thread(new PrintRunnable()).start();
        }
    }
}

class PrintRunnable implements Runnable{
	
	public void run(){
		MyClass my = new MyClass();
		my.getYourNumber();
		System.out.println(my.yourNumber);
	}
}

class MyClass
{
    static private int myCount = 0;
    int yourNumber;
    private static synchronized int nextCount()
    {
        return ++myCount;
    }
        
    public void getYourNumber()
    {
        yourNumber = nextCount();
    }
}

