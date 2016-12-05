package src.mutipleThread;

public class Test1 {

	public static void main(String[] args){
        Integer[] number={1,2,3,4};
        Character[] upperChar={'A','B','C','D'};
        Character[] lowerChar={'a','b','c','d'};
        Mutex mutex=new Mutex(3);
        //new Thread(new PrintRunnable(number,1,mutex)).start();
        //new Thread(new PrintRunnable(upperChar,2,mutex)).start();
        //new Thread(new PrintRunnable(lowerChar,3,mutex)).start();
        
        new Thread(new PrintRunnable("1BrwefdfgdfgfdghfhggfhjghjhhgjBrwefdfgdfgfdghfhggfhjghjhhgjBrwefdfgdfgfdghfhggfhjghjhhgj",1,mutex)).start();
        new Thread(new PrintRunnable("A",2,mutex)).start();
        new Thread(new PrintRunnable("Brwefdfgdfgfdghfhggfhjghjhhgj",3,mutex)).start();
    }

}

class Mutex{
    private int order=1; //记录线程顺序号
    private int maxNum=0; //最大线程数
     
    Mutex(int num){
        this.maxNum=num;
    }
    //循环设置下一次要打印的顺序号
    public void setOrder(){
        this.order=(++order)<=maxNum?order:1;
    }
    //得到顺序号
    public int getOrder(){
        return this.order;
    }
}
//打印工作
class PrintRunnable implements Runnable{
     
    private Object[] cont=null; //打印内容
    private int order=-1; //当前线程的打印顺序
    private Mutex mutex=null; //临界区对象
    private Object contS=null; //打印内容
     
    PrintRunnable(Object[] c,int o,Mutex m){
        this.cont=c;
        this.order=o;
        this.mutex=m;
    }
    
    PrintRunnable(Object c,int o,Mutex m){
        this.contS=c;
        this.order=o;
        this.mutex=m;
    }
     
    public void run(){
        try{
            //循环打印内容
        	if(cont!=null){
	            for(Object c:cont){
	                //互斥操作临界区
	                synchronized(mutex){
	                    //如果当前工作线程的顺序号不等于临界区的顺序号，则工作线程等待阻塞,并放弃锁
	                    while(mutex.getOrder()!=this.order)
	                        mutex.wait();
	                    //打印内容
	                    System.out.print(c+" "); 
	                    if(mutex.getOrder()==3)
	                    System.out.println();
	                    //设置下一次允许打印的线程顺序
	                    mutex.setOrder();
	                    //唤醒在临界区等待的所有线程
	                    mutex.notifyAll();
	
	                }
	            }
            }else{
            	 synchronized(mutex){
                    //如果当前工作线程的顺序号不等于临界区的顺序号，则工作线程等待阻塞,并放弃锁
                    while(mutex.getOrder()!=this.order)
                        mutex.wait();
                    //打印内容
                    System.out.print(contS+" "); 
                    if(mutex.getOrder()==3)
                    System.out.println();
                    //设置下一次允许打印的线程顺序
                    mutex.setOrder();
                    //唤醒在临界区等待的所有线程
                    mutex.notifyAll();
            	 }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
         
    }
}

class ThreadNode
{
    boolean hasToken = false;//true if this is first Thread
    ThreadNode next;//need initialized
    synchronized void waitToken() throws InterruptedException
    {
        while(!hasToken)
            this.wait();
    }
    void switchNext()
    {
        this.hasToken = false;
        next.setToken();
    }
    synchronized void setToken()
    {
        this.hasToken = true;
        this.notifyAll();
    }
    public void loop() throws InterruptedException
    {
        for(;;)
        {
            this.waitToken();
            //do my jobs
            this.switchNext();
        }
    }
}