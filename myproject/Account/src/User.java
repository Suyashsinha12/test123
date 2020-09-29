
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account []account_list=new Account[3];

		account_list[0]= new Account("suyash",1,30000);
		account_list[1]= new Savings("suku",2,50000);
		account_list[2]= new Current("lucky",3,10000);
		
		
		for(Account act:account_list) {
			act.showDetails();
			act.calInterest();
		}
		
		
		
	}

}
