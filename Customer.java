// An instantiable class which the customers

import java.io.*;

public class Customer implements Serializable{
	
	private int AccNo;	
	private String Forename;
	private String Surname;
	private String Address;
	private int MobileNumber;
	private int Balance;
	
	//accessor method that allow us to aceess the customer details
	
	public int getAccNo() {return AccNo;}
	public String getForename() { return Forename;}
	public String getSurname() { return Surname;}
	public String getAddress() {return Address;}
	public int getMobileNumber() {return MobileNumber;}
	public int getBalance() {return Balance;}
	
	//mutator methods to change the value of an attribute
	
	public void setAccNo( int AccNo) {
		
		this.AccNo = AccNo;
		
	}
	
	public void setForename( String Forename) {
		
		this.Forename = Forename;
			
	}
	
	public void setSurname( String Surname) {
		
		this.Surname = Surname;
			
	}
	
	public void setAddress( String Address) {
		
		this.Address = Address;
			
	}

	public void setMobileNumber( int MobileNumber){
		
		this.MobileNumber = MobileNumber;
		
	}
	
	public void setBalance( int Balance){
		
		this.Balance = Balance;
		
	}

	// full-args constructor
	
	public Customer(int AccNo, String Forename, String Address, int MobileNumber, int Balance) {
				
				setAccNo(AccNo);
				setForename(Forename);
				setSurname(Surname);
				setAddress(Address);
				setMobileNumber(MobileNumber);
				setBalance(Balance);
				
	}	
}