package mainclassbank;
import java.util.Scanner;

import test.CheckPinNo;
import test.Deposit;
import test.Withdraw;
import test.pinNoLength;
public class BankMainClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
			while(true)
			{
				System.out.println("enter the pin number: ");
				int pinNo=s.nextInt();
				pinNoLength pnl=new pinNoLength();
				int len=pnl.length(pinNo);
				if(len==4)
				{
					CheckPinNo cpn=new CheckPinNo();
					boolean k=cpn.verify(pinNo);
					if(k)
					{
						System.out.println("===choice===");
						System.out.println("1.withdraw\n2.Deposit");
						System.out.println("enter the choice: ");
						switch(s.nextInt())
						{
						case 1: 
							System.out.println("enter the amount: ");
							int a1=s.nextInt();
							if(a1>=0&&a1%100==0) {
								Withdraw wd=new Withdraw();
								wd.process(a1);
							}
							else {
								System.out.println("Invalid amount...");
							}
							break xyz;
						case 2:
							System.out.println("enter the amount: ");
							int a2=s.nextInt();
							if(a2>=0&&a2%100==0) {
								Deposit dp=new Deposit();
								dp.process(a2);
							}
							else {
								System.out.println("Invalid amount...");
							}
							break xyz;
						default: 
							System.out.println("Invalid choice...");
							//break xyz;
						}// end of switch
					}
					else {
						System.out.println("invalid pin number...");
						count++;
					}
					
				}
				else {
					System.out.println("Invalid pin number...");
					count++;
				}
				
				if(count==3)
				{
					System.out.println("sorry! Tranasction blocked...");
					break; //stop loop
				}
				//break xyz;
			}//loop end
		//s.close();
	}
}
