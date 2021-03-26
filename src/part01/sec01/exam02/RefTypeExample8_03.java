package part01.sec01.exam02;

class Account {
	String accountNo;
	String ownerName;
	int balance;

	Account(String accountNo, String ownerName, int balance) {
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

class CheckingAccount extends Account {
	String cardNo;

	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {

		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능 합니다.");

		return withdraw(amount);
	}
}

public class RefTypeExample8_03 {

	public static void main(String[] args) {
//		Account obj = new CheckingAccount("111-22-33333333", "홍길동", 100000, "4444-5555-6666-7777");

		Account obj = new Account("111-22-33333333","홍길동",100000);
		CheckingAccount obj2 = (CheckingAccount)obj;
		
		try {
			int amount = obj2.pay("4444-5555-6666-7777",47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj2.cardNo);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

/*
 * try { int amount = obj.pay("4444-5555-6666-7777");
 * System.out.println("인출액: "+ amount); System.out.println("카드번호: " +
 * obj.cardNo); } catch (Exception e) { System.out.println(e.getMessage()); }
 */

//		CheckingAccount obj2 = obj;						//(X)
//			//(O) 부모가 자식타입으로 대입은 안된다. (캐스팅해야함)
