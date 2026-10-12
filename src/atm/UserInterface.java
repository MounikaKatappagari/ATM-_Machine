package atm;
import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AtmOperation imp = new AtmOperation();
		int atmnumber = 123456;
		int atmpin = 123;
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("ENTER THE ATM NUMBER");
		int atmnum2 = scan.nextInt();
		System.out.println("ENTER THE ATM PIN");
		int atmpin2 = scan.nextInt();
		if (atmnumber==atmnum2 && atmpin==atmpin2) {
			while(true) {
			System.out.println("1.viewAvailable Balance \n 2.withdrawAmount \n 3.DepositeAmount \n 4.viewMiniStatement \n 5.exit");
			System.out.println("Enther the choice");
			int ch = scan.nextInt();
			if(ch==1) {
				imp.viewBalance();
			} else if(ch==2){
				System.out.println("Enter the amont to withdraw");
				double withdrawamount = scan.nextDouble();
				imp.withdrawAmount(withdrawamount);
			}
			else if(ch==3) {
				System.out.println("Enter the amount to deposit");
				double depositeAmount = scan.nextDouble();
				imp.depositeAmount(depositeAmount);
			}
			else if(ch==4) {
				imp.viewMiniStatement();
			}
			else if(ch==5) {
				System.out.println("Collect Your ATM Card\n Thank You");
				System.exit(status);
			}
			}
		}
		else {
			System.out.println("INCORRECT ATM NUMBER OR PIN");
		}
	}

}
