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
    private int order=1; //��¼�߳�˳���
    private int maxNum=0; //����߳���
     
    Mutex(int num){
        this.maxNum=num;
    }
    //ѭ��������һ��Ҫ��ӡ��˳���
    public void setOrder(){
        this.order=(++order)<=maxNum?order:1;
    }
    //�õ�˳���
    public int getOrder(){
        return this.order;
    }
}
//��ӡ����
class PrintRunnable implements Runnable{
     
    private Object[] cont=null; //��ӡ����
    private int order=-1; //��ǰ�̵߳Ĵ�ӡ˳��
    private Mutex mutex=null; //�ٽ�������
    private Object contS=null; //��ӡ����
     
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
            //ѭ����ӡ����
        	if(cont!=null){
	            for(Object c:cont){
	                //��������ٽ���
	                synchronized(mutex){
	                    //�����ǰ�����̵߳�˳��Ų������ٽ�����˳��ţ������̵߳ȴ�����,��������
	                    while(mutex.getOrder()!=this.order)
	                        mutex.wait();
	                    //��ӡ����
	                    System.out.print(c+" "); 
	                    if(mutex.getOrder()==3)
	                    System.out.println();
	                    //������һ�������ӡ���߳�˳��
	                    mutex.setOrder();
	                    //�������ٽ����ȴ��������߳�
	                    mutex.notifyAll();
	
	                }
	            }
            }else{
            	 synchronized(mutex){
                    //�����ǰ�����̵߳�˳��Ų������ٽ�����˳��ţ������̵߳ȴ�����,��������
                    while(mutex.getOrder()!=this.order)
                        mutex.wait();
                    //��ӡ����
                    System.out.print(contS+" "); 
                    if(mutex.getOrder()==3)
                    System.out.println();
                    //������һ�������ӡ���߳�˳��
                    mutex.setOrder();
                    //�������ٽ����ȴ��������߳�
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