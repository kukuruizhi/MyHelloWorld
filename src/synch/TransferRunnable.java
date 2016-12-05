package src.synch;

public class TransferRunnable implements Runnable{
	private Bank bank;
	private int fromAccount;
	private double maxAmount;
	private int DELAY = 10;
	
	public TransferRunnable(Bank b, int from , double max){
		bank =b;
		fromAccount = from;
		maxAmount = max;
	}
	
	public void run(){
		
		while(true){
			int toAccount = (int)(bank.size()*Math.random());
			double amount = maxAmount * Math.random();
			try {
				bank.transfer(fromAccount, toAccount, amount);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep((int)(DELAY*Math.random()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
