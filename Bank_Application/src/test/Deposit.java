package test;

public class Deposit implements Transaction
{
	public void process(int amt) {
		System.out.println("amount deposited: "+amt);
		b.bal=b.bal+amt;
		System.out.println("balance amount: "+b.bal);
		System.out.println("Transaction completed successfully...");
	}
}
