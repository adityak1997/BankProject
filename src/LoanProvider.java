import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author akashilkar
 *
 */

public class LoanProvider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch case for Type of Loan
		Loan ln;
		Scanner sc = new Scanner(System.in);
		String tol = sc.nextLine();
		switch(tol) {
			case "Home loan":
				System.out.println("here");
				ln = new HomeLoan();
				break;
			
			case "Personal loan":
				ln = new PersonalLoan();
				break;
			case "Travel loan":
				ln = new TravelLoan();
				break;
			case "Education loan":
				ln = new EducationLoan();
				break;
			
			default:
				ln = null;
		}
		ArrayList<String> addr = new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			String s;
			System.out.println("Input Address line #"+i);
			s=sc.nextLine();
			addr.add(s);
		}
		//addr.add("bnglr");addr.add("90");addr.add("09123");addr.add("Bell");addr.add("karnataka");
		System.out.println("Input Name");
		String name = sc.nextLine();
		System.out.println("Input Phone number");
		int pn = sc.nextInt();
		System.out.println("Input cid");
		int cid = sc.nextInt();
		System.out.println("Bank Balance");
		int balance = sc.nextInt();
		System.out.println("Time to repay");
		int time = sc.nextInt();
		System.out.println("Loan amount");
		int loanAmount = sc.nextInt();
		Loanee person = new Loanee(name,pn,cid,addr,tol,balance,time,loanAmount);
		if(ln.validate(person) == true) {
			System.out.println("Loan can be granted to this individual");
			System.out.println("Value to be returned in the stipulated time: "+ln.returnValue(person));
		}
		//System.out.println(ln.validate(person));
		
	}

}
