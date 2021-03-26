package part01.sec01.exam02;

class Account2 {
	String accountNo;
	String ownerName;
	int balance;

	Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}

	int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;

		return amount;

	}
}

class CheckingAccount2 extends Account2 {
	String cardNo;

	CheckingAccount2(String accountNo, String ownerName, int balance, String cardNo) {

		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능 합니다.");

		return withdraw(amount);
	}
}

public class RefTypeExample9_04 {

	public static void main(String[] args) {
		Account2 obj = new Account2("111-22-33333333","홍길동",100000); 
		
		if(obj instanceof CheckingAccount2)
			pay((CheckingAccount2)obj);
		else
			System.out.println("캐스트 할 수 없습니다.");
	}
		public static void pay(CheckingAccount2 obj) {			
		try {
			int amount = obj.pay("4444-5555-6666-7777",47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj.cardNo);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
