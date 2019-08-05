abstract class Loan{
	abstract public boolean validate(Loanee person);
	abstract public double interestRate();
	static boolean isSimpleInterest;
	public double returnValue(Loanee person)
	{
		//System.out.println(interestRate());
		//System.out.println("Inside returnValue"+ (double)person.loanAmount+" "+(1.0+interestRate())+"  "+(double)person.timeToRepay);
		if(isSimpleInterest) 
			return person.loanAmount*(person.timeToRepay*interestRate()+1);
		else
			return (double)person.loanAmount*Math.pow((double)1+interestRate(), (double)person.timeToRepay);
	}
	
}

class HomeLoan extends Loan
{
	static int minBal = 1000000;
	public double interestRate(){
		return 0.06;
	}

	static boolean isSimpleInterest = false; //false implies Compound Interest
	public boolean validate(Loanee person)
	{
		if(person.balance<minBal)
			return false;
		else
			return true;
	}
}
class EducationLoan extends Loan
{
	static int minBal = 500000;
	public double interestRate(){
		return 0.08;
	}

	static boolean isSimpleInterest = false; //false implies Compound Interest
	public boolean validate(Loanee person)
	{
		if(person.balance<minBal)
			return false;
		else
			return true;
	}
}

class PersonalLoan extends Loan
{
	static int minBal = 0;
	public double interestRate(){
		return 0.05;
	}

	static boolean isSimpleInterest = false; //false implies Compound Interest
	public boolean validate(Loanee person)
	{
		if(person.balance<minBal)
			return false;
		else
			return true;
	}
}

class TravelLoan extends Loan
{
	static int minBal = 5000000;
	public double interestRate(){
		return 0.01;
	}

	static boolean isSimpleInterest = true; //false implies Compound Interest
	public boolean validate(Loanee person)
	{
		if(person.balance<minBal)
			return false;
		else
			return true;
	}
}
