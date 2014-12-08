import java.util.*;
import javax.swing.*;
import java.io.*;

public class QuarrySystemDriver{
	
	public static void main (String args[]) throws /*IO*/Exception/*NullPointerException*/{
		
		List<Customer> CustomerFile = new ArrayList<Customer>();
		List<Stock> StockFile = new ArrayList<Stock>();
		
		boolean quit = false;
		int menuItem;
		int AccountNumber=0;
		
		do{
			String menu = JOptionPane.showInputDialog("Choose a menu item: \n\n0: To Exit\n1: Customers\n2: Stock\n3: Invoice");
			menuItem = Integer.parseInt(menu);
			switch	(menuItem){
				
				case 1:
					JOptionPane.showMessageDialog(null,"You've chosen item #1");
					
					Customer cust = new Customer();

						cust.setForename(JOptionPane.showInputDialog("Enter The Forename Of the customer: "));	
						for(int i = 0; i < cust.getForename().length(); i++)
						{
							
							if(!Character.isLetter(cust.getForename().charAt(i)))
							{
								
								JOptionPane.showMessageDialog(null,"This is not a forename");
								break;
								
							}
							
							
						}
						cust.setSurname(JOptionPane.showInputDialog("Enter the surname of the customer: "));
						for(int i = 0; i < cust.getSurname().length(); i++)
						{
							
							if(!Character.isLetter(cust.getSurname().charAt(i)))
							{
								
								JOptionPane.showMessageDialog(null,"This is not a Surname");
								break;
								
							}
							
							
						}
						
					 	cust.setAddress(JOptionPane.showInputDialog("Enter the address of the customer: "));
						for(int i = 0; i < cust.getAddress().length(); i++)
						{
							
							if(!Character.isLetter(cust.getAddress().charAt(i)))
							{
								
								JOptionPane.showMessageDialog(null,"This is not an address");
								break;
								
							}
							
							
						}
						
						cust.setMobileNumber(Integer.parseInt((JOptionPane.showInputDialog("Enter the 9 digit phone number phone number of the customer(leave out 0); "))));
						if(cust.getMobileNumber() >= 0000000000 && cust.getMobileNumber() < 999999999)
						{
						
							cust.setBalance(Integer.parseInt((JOptionPane.showInputDialog("Enter the current owed blance by this customer; "))));
							if(cust.getBalance() >= 0000000000 && cust.getBalance() < 999999999)
							{
								
								CustomerFile.add(cust);
								try
								{
									File f1 = new File("CustomerDetails.dat");
								
									FileOutputStream fos1 = new FileOutputStream(f1);
								
									ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
									oos1.writeObject(CustomerFile);
									oos1.close();
								}catch (Exception e){}
								
								break;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Invaid Balance");
							}
						
						}
						else
						{
							
							JOptionPane.showMessageDialog(null,"Invaid phone number");
							
						}	
							
						break;
					
				case 2:
					
					JOptionPane.showMessageDialog(null,"You've chosen item #2");
					
					Stock item = new Stock();
					
					item.setName(JOptionPane.showInputDialog("Enter The item name: "));
					for(int ie = 0; ie < item.getName().length(); ie++)
					{
							
						if(!Character.isLetter(item.getName().charAt(ie)))
						{
								
							JOptionPane.showMessageDialog(null,"This is not a name");
							break;
								
						}
							
							
					}
					
					
					item.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Enter the quantiy of the item (Ton): ")));
					if(item.getQuantity() >= 0000000000 && item.getQuantity() < 999999999)
					{
						item.setCostPerTon(Integer.parseInt(JOptionPane.showInputDialog("Enter the cost of the item Per Ton: ")));
						if(item.getCostPerTon() >= 0000000000 && item.getCostPerTon() < 999999999)
						{
							
							StockFile.add(item);
							try
							{
								File f2 = new File("StockDetails.dat");
									
								FileOutputStream fos2 = new FileOutputStream(f2);
									
								ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
								oos2.writeObject(StockFile);
								oos2.close();
							}catch (Exception e){}
							break;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You have entered an invalid Cost");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "You have entered an invalid Quantity");
					}
					
					
					break;
					
				case 3:
					JOptionPane.showMessageDialog(null,"You've chosen item #3");
					
					int InvoiceId=0;
					int InvoicesId=0;
					
					ArrayList<Customer> a1 = null;
					try{
					File fInput1          = new File("CustomerDetails.dat");
					FileInputStream   fis = new FileInputStream(fInput1);
					ObjectInputStream ois = new ObjectInputStream(fis);
					a1 = (ArrayList)ois.readObject();
					} catch (Exception e){}	
						
					ArrayList<Stock> a2 = null;
					try{
					File fInput2          = new File("StockDetails.dat");
					FileInputStream   fis2 = new FileInputStream(fInput2);
					ObjectInputStream ois2 = new ObjectInputStream(fis2);
					a2 = (ArrayList)ois2.readObject();
					} catch (Exception e){}						
					Iterator<Customer> it = a1.iterator();  //method from ArrayList class
					while (it.hasNext())
					{
						System.out.println("\nID: " +  InvoiceId++ + it.next().toString());
					}
						System.out.println("\nStock Details");
					
					Iterator<Stock> it2 = a2.iterator();
					while (it2.hasNext())
					{
						System.out.println("\nID: " +  InvoicesId++ + it2.next().toString());
					}	
										
					int Id_Finder = Integer.parseInt(JOptionPane.showInputDialog("Please enter the id of the customer you wish to issue an invoice"));
					int Id_Finder2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the id of the item that they are buying"));
					int Quantity_Needed = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantanty needed: "));
					
					int Total_Cost = Quantity_Needed * a2.get(Id_Finder2).getCostPerTon();
					
					int New_Quantity = a2.get(Id_Finder2).getQuantity() - Quantity_Needed;
					int New_Balance = a1.get(Id_Finder).getBalance() + Total_Cost;
				
					a1.get(Id_Finder).getBalance() = New_Balance;
					a2.get(Id_Finder2).getQuantity() = New_Quantity;
						
					JOptionPane.showMessageDialog(null, "Forename: " + a1.get(Id_Finder).getForename() + "\nSurname: " + a1.get(Id_Finder).getSurname() + "\nItem: " + a2.get(Id_Finder2).getName() + "\nCost of item per unit: " + a2.get(Id_Finder2).getCostPerTon() + "\nTotal Cost: €" + Total_Cost);
					break;
				case 0:
                	quit = true;
                    break;
               	default:
                	JOptionPane.showMessageDialog(null,"Invalid choice.");
                  }
                  
			}while (!quit);
      System.out.println("Bye-bye!");
      
      }	
			
}
	
