package projects;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		int pin = 2604;
		String name;
		double balance = 0;

		double credit = 0;
		double withdraw = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your PIN Number");
		int pwd = scan.nextInt();

		if (pin == pwd) {
			System.out.println("Welcome to HDFC Atm...");
			System.out.println("Please Enter your Name");
			name = scan.next();
			System.out.println("Welcome to HDFC Atm Mr." + name);

			while (true) {
				System.out.println("***********************************");
				System.out.println("Press 1 to Check Balance");
				System.out.println("Press 2 to Credit Amount");
				System.out.println("Press 3 to Withdraw Amount");
				System.out.println("Press 4 to Get Receipt");
				System.out.println("Press 5 to Exit");
				System.out.println("***********************************");

				int opt = scan.nextInt();
				switch (opt) {
				case 1:
					System.out.println("Your Net Balance is : " + balance);
					break;
				case 2:
					System.out.println("How much do you want to Credit");
					credit = scan.nextDouble();
					System.out.println("The Amount Rs." + credit + " is Credited to the Account");
					balance = balance + credit;
					System.out.println("The Net Balance is : " + balance);
					break;
				case 3:
					System.out.println("How much do you want to Withdraw");
					withdraw = scan.nextDouble();
					if (withdraw > balance) {
						System.out.println("Insufficient Balance...");
					} else {
						balance = balance - withdraw;
						System.out.println("The Amount Rs." + withdraw + " is withdrawed From your Account");
						System.out.println("The Net Balance is : " + balance);
					}
					break;
				case 4:
					System.out.println("***********************************");
					System.out.println("Welcome to the HDFC Atm Mr." + name);
					System.out.println("Your Net Balance is : " + balance);
					System.out.println("Last Credited Amount is : " + credit);
					System.out.println("Last Withdrawed Amount is : " + withdraw);
					System.out.println("***********************************");
				}
				if (opt == 5) {
					System.out.println("Thanks for Coming...");
					break;
				}
			}
		} else {
			System.out.println("Wrong PIN Number. Please Enter the correct PIN Number");
		}
		scan.close();
	}
}
