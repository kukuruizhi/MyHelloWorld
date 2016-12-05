package src.synch;

public class UnsynchBankTest {

	public static final int NACCOUNTS = 100;
	public static final double INITTAL_BALANCE = 1000;
	
	public static void main(String[] args) {
		Bank b = new Bank(NACCOUNTS , INITTAL_BALANCE);
		int i;
		for(i=0; i<NACCOUNTS; i++){
			TransferRunnable r = new TransferRunnable(b,i, INITTAL_BALANCE);
			Thread t = new Thread(r);
			t.start();
		}
	}

}
