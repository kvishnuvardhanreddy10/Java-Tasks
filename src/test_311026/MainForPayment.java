package test_311026;


public class MainForPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment p;
		
		p = new UPI();
		p.pay();
		
		p = new CreditCard();
		p.pay();
		
		p = new Cash();
		p.pay();
	}

}
