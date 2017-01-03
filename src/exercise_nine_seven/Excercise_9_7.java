/**
 * 
 */
package exercise_nine_seven;
/**
 * @author Sergei
 *
 */
public class Excercise_9_7 {
	public static void main(String[] args) {
		
				Account account = new Account(1122, 20000);
				account.setAnnual(4.5);
				account.withdraw(2500);
				account.deposit(3000);

				System.out.println("Account ID: " + account.Id());
				System.out.println("Date created: " + account.DateCreated());
				System.out.println("Balance: "+ account.Balance());
				System.out.println("Monthly interest: "+ account.MonthlyInterest());
	}
}

