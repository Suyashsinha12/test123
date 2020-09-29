
public class Account {
	
	String aName;
	long aNumber;
	double rateOfInt;
	double balance,deposit,withdraw;
	
	
		public Account() 
		{
			double rateOfInt=5;
			System.out.println("Parameter less Constructor");
			
			System.out.println("Rate of interest:"+rateOfInt);
	}


		public Account(String aName,long aNumber,double balance) 
		{
			this.aName=aName;
			this.aNumber=aNumber;
			this.balance=balance;
			//this.rateOfInt=rateOfInt;
			//System.out.println("Parameterised cons");
		}
		
		public void deposit(double amount)
		{
			balance=balance + amount;
			System.out.println("Deposit amount is : "+amount+ " and total balance="+balance);
		}
		
		public void withdraw(double amount)
		{
			balance=balance - amount;
			System.out.println("Withdrawl amount is : "+amount+ " and Remaining balance="+balance);
		}
		public void showDetails()
		{
			
			System.out.println("Name : "+aName+" Acc no.:"+aNumber);
			
		}
		
		public void showBalance()
		{
			
			System.out.println("Current Balance is : "+balance);
			
		}
			
		public void calInterest() 
		{
			int time=3;
			double rateOfInt=5;
			double in=((balance*time*rateOfInt)/100);
			System.out.println("Total Balance:"+(balance+in));
		}
}
