package oopsTask;

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment p;
		
		p = new UPIPayment();
		p.pay();
		
		p = new CardPayment();
		p.pay();
		
		p = new CashPayment();
		p.pay();
	}

}
