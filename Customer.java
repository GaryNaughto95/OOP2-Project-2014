// An instantiable class which the customers

import java.io.*;

public class Customer implements Serializable{
		
	private String Forename;
	private String Surname;
	private String Address;
	private int MobileNumber;
	private int Balance;
	
	//accessor method that allow us to aceess the customer details
	
	public String getForename() { return Forename;}
	public String getSurname() { return Surname;}
	public String getAddress() {return Address;}
	public int getMobileNumber() {return MobileNumber;}
	public int getBalance() {return Balance;}
	
	//mutator methods to change the value of an attribute
	
	
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
	
	public Customer(String Forename, String Surname, String Address, int MobileNumber, int Balance) {
				
				setForename(Forename);
				setSurname(Surname);
				setAddress(Address);
				setMobileNumber(MobileNumber);
				setBalance(Balance);
				
	}
	
	public Customer(){
		
		this("Not Given","Not Given","Not Givin",0,0);
		
	}
	
	public String toString(){
		
		return "\nForename:  " + getForename() + "\nSurname: " + getSurname() + "\nAddress: " + getAddress() + "\nMobileNumber: 0" + getMobileNumber() + "\nBalance: " + getBalance();
		
	}
		
}