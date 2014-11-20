// An instantiable class which all the stock

public class Stock {
	
	private String name;
	private int Quantity;
	private int CostPerTon;
	
	//accessor method that allows us to acess the Stock details 
	
	public String getName() {return name;}
	public int getQuantity() {return Quantity;}
	public int getCostPerTon() {return CostPerTon;}
	
	//mutator methods to change the value of an attribute
	
	public void setName( String name) {
		
		this.name = name;
		
	}
	
	public void setQuantity( int Quantity) {
		
		this.Quantity = Quantity;
		
	}
	
	public void setCostPerTon( int CostPerTon) {
		
		this.CostPerTon = CostPerTon;
		
	}
	
	// full-arg constructor 
	
	public Stock(String name, int Quantity, int CostPerTon){
		
		setName(name);
		setQuantity(Quantity);
		setCostPerTon(CostPerTon);
		
	}
}