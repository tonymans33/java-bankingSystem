/**
 * An Account class for making client account
 */
public class Account {

	/**
	 * A constructor to initialize the balance and account number
	 */
	public Account () {
		balance = 0;
		int x = 1;
		accountNumber = x;
		x++;
	}

	/**
	 * A method to set the new balance
	 * @param b the new balance
	 */

	public void setBalance (double b) {
		balance = b;
	}

	/**
	 * A method to return the balance
	 * @return balance
	 */
	public double getBalance () {
		return balance;
	}

	/**
	 * A method to set the new account number
	 * @param a the new account number
	 */

	public void setAccountNumber (int a) {
		accountNumber = a;
	}

	/**
	 * A method to return the new account number
	 * @return accountnumber
	 */
	public int getAccountNumber () {
		return accountNumber;
	}

	/**
	 * Overrided mtoString method to return the account number and the balance
	 * @return accountnumber and balance
	 */
	@Override
	public String toString () {
		return String.format("Account Number: " + accountNumber + "\n" + "Balance = " + balance);
	}

	/**
	 * Withdraw method to take a value and reduce it form the balance
	 * @param value
	 */

	public void withdraw (double value) {
		if(value <= balance) {
			balance -= value;
			System.out.println ("Withdraw completed\n");
			System.out.println ("Your balance now = " + balance);
		}

		else
			System.out.println ("Not enough balance");
	}

	/**
	 * A deposit method to take a value and added it to the balance
	 * @param value
	 */

	public void deposit (double value) {
		balance += value;
		System.out.println ("Deposit completed\n");
		System.out.println ("Your balance now = " + balance);
	}

	private double balance;
	private static int accountNumber;

}

/**
 * A Special Account class extends account class
 */
class specialAccount extends Account {
	/**
	 * A withdraw method to take a value and reduce it from the balance
	 * @param value
	 */
	public void withdraw (double value) {
		if(value <= getBalance () + 1000) {
			double newBalance = getBalance () - value;
			setBalance (newBalance);
			System.out.println ("Withdraw completed\n");
			System.out.println ("Your balance now = " + getBalance ());
		}

		else
			System.out.println ("Not enough balance");
	}
}
