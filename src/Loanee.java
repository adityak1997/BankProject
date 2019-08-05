import java.util.ArrayList;

public class Loanee
{
	public String username;
	private int phoneNumber;
	private int cid;
	//private String[] address = new String[5];
	private ArrayList<String> address = new ArrayList<>();
	public String typeOfLoan;
	public int balance;
	public int timeToRepay;
	public int loanAmount;
	
	Loanee(String un, int pn, int ci, ArrayList<String> add, String tol, int balance, int time, int loanAmount )
	{
		this.username = un;
		this.phoneNumber=pn;
		this.cid=ci;
		this.address=add;
		this.typeOfLoan=tol;
		this.balance=balance;
		this.loanAmount=loanAmount;
		this.timeToRepay=time;
	}
	
	
	public void setphoneNumber(int phonenumber)
	{
		this.phoneNumber=phonenumber;
	}
	public void setcid(int cid)
	{
		this.cid=cid;
	}
	
	public void setAddress(String city, String housenumber, String pin, String area, String state)
	{
		this.address.add(city);
		this.address.add(housenumber);
		this.address.add(pin);
		this.address.add(area);
		this.address.add(state);
	}
	
	public String getAddress()
	{
		String fullAddress = address.get(0)+address.get(1)+address.get(2)+address.get(3)+address.get(4);
		return fullAddress;
	}
	public int getphoneNumber()
	{
		return this.phoneNumber;
	}
	
	public int getcid()
	{
		return this.cid;
	}
}
