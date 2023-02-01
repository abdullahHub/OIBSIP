package ATM_INTERFACE;
import java.util.Scanner;
public class ATM
{
    private static int aCCNO;
	private static ATM a;
	private static Scanner s;
	public static void main(String args[] )
    { 
        setA(new ATM());
        int balance = 30000, withdraw=0, deposit=0;
        s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine...");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Transaction History");
            System.out.println("5.Transfer Money");
            System.out.println("6.EXIT");
            System.out.println("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Money Withdraw Successfully !!!");
                    System.out.println("Please collect your money.");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                    System.out.println("Please Check Your Balance");
                }
                System.out.println("");
                break;
                
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited.");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.out.println("Transaction History.");
                System.out.println( "|Depodite Ammount : "+deposit+"   |");
                System.out.println( "|Withdraw Ammount : "+withdraw+"  |");
                
                break;

                case 5:
                 int amount;
                System.out.println("Enter The Account No : ");
                setaCCNO(s.nextInt());
                System.out.println("Enter The Amount  : ");
                amount=s.nextInt();
                if(balance >= amount)
                {
                    balance = balance - amount;
                    System.out.println("Transfer Money Successfully !!!");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                    System.out.println("Please Check Your Balance");
                }
                break;
                case 6:
                System.exit(0);
            }
        }
    }

	public static int getaCCNO() {
		return aCCNO;
	}

	public static void setaCCNO(int aCCNO) {
		ATM.aCCNO = aCCNO;
	}

	public static ATM getA() {
		return a;
	}

	public static void setA(ATM a) {
		ATM.a = a;
	}   
}