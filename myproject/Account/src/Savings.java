
public class Savings extends Account{
	
	public Savings()
	{
		super();
	}
	
	public Savings(String aName, long aNumber,double balance) 
	{
		super(aName, aNumber, balance);
		// TODO Auto-generated constructor stub
	}
	public void calInterest() 
	{
		int time=3;
		double rateOfInt=5.5;
		double in=((balance*time*rateOfInt)/100);
		System.out.println("Total Balance:"+(balance+in));
	}
	
	
}
