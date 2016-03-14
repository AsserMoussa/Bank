import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtmMain {

	static Customer client = new Customer();

	public static void main(String[] args) throws IOException {
		client.setName("Asser");
		client.setPin(1234);
		client.setChecking(1000000);
		client.setSavings(1000000000);

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Please enter your name");
		String name = br.readLine();

		System.out.println("Please enter your PIN");
		String pin = br.readLine();
		int y = Integer.parseInt(pin);
		if (client.getName().equals(name) && client.getPin() == y) {
			System.out.println("Welcome " + client.getName() + " Would you like to withdraw or deposit?");
			String choiceWD = br.readLine();
			System.out.println("Checking or Savings?");
			String choiceCS = br.readLine();
			if (choiceWD.equals("withdraw") && choiceCS.equals("Checking") ) {
				System.out.println("Please enter the amount");
				String amount = br.readLine();
				double x = Integer.parseInt(amount);
				System.out.println("Current Balance:" + client.getChecking());
				System.out.println("Withdrawal amount:" + x);
				System.out.println("Current Balance after withdrawal:" + (client.getChecking() - x));
			} else if (choiceWD.equals("withdraw") && choiceCS.equals("Savings") ) {
				System.out.println("Please enter the amount");
				String amount = br.readLine();
				double x = Integer.parseInt(amount);
				System.out.println("Current Balance:" + client.getSavings());
				System.out.println("Withdrawal amount:" + x);
				System.out.println("Current Balance after withdrawal:" + (client.getSavings() - x));
			} else if (choiceWD.equals("deposit")  && choiceCS.equals("Checking")) {
				System.out.println("Please enter the amount");
				String amount = br.readLine();
				double x = Integer.parseInt(amount);
				System.out.println("Current Balance:" + client.getChecking());
				System.out.println("Deposit amount:" + x);
				System.out.println("Current Balance after Deposit:" + (client.getChecking() + x));
			} else if (choiceWD.equals("deposit") && choiceCS.equals("Savings")) {
				System.out.println("Please enter the amount");
				String amount = br.readLine();
				double x = Integer.parseInt(amount);
				System.out.println("Current Balance:" + client.getSavings());
				System.out.println("Deposit amount:" + x);
				System.out.println("Current Balance after Deposit:" + (client.getSavings() + x));
			} else {
				System.out.println("Invalid Entry");
			}
		}

		else {
			System.out.println("User not found");
		}
	}
}
