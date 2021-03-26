package part01.sec01.exam02;

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo, String ownerName,int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount)throws Exception{
		if(balance<amount) 
			throw new Exception("잔액이 부족합니다.");
			balance -= amount;
			
			return amount;
		
	}
}

class CheckingAccount extends Account{
	String cardNo;
	
	CheckingAccount(String accountNo,String ownerName,int balance, String cardNo){
		
		super(accountNo,ownerName,balance);
		this.cardNo=cardNo;
	}
	
	int pay(String cardNo,int amount)throws Exception{
		if(!cardNo.equals(this.cardNo) || (balance<amount))
			throw new Exception("지불이 불가능 합니다.");
		
		return withdraw(amount);
	}
}



public class RefTypeExample8_03 {

	public static void main(String[] args) {
		

	}

}
