package test;

public class Withdraw implements Transaction
{
 public void process(int amt)
 {
	 if(amt<b.bal) {
		 System.out.println("amount withdraw: "+amt);
		 b.bal=b.bal-amt;
		 System.out.println("Balance amount: "+b.getBalance());
		 System.out.println("Transaction completed successfully...");
	 }
	 else {
		 System.out.println("Insufficient fund...");
	 }
 }
}
