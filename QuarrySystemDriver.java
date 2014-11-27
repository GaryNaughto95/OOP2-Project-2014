import java.util.*;
import javax.swing.*;

public class QuarrySystemDriver{
	
	public static void main (String args[]){
		
		Scanner in = new Scanner(System.in);
		
		boolean quit = false;
		int menuItem;
		
		do{
			String menu = JOptionPane.showInputDialog("Choose a menu item: \n0: To Exit\n1: Customers\n2: Stock\n3: Invoice\n4: Payment" );
			menuItem = Integer.parseInt(menu);
			switch	(menuItem){
				
				case 1:
					JOptionPane.showMessageDialog(null,"You've chosen item #1");
					
					Customer cust1 = new Customer();
					
					cust1.setAccNo(Integer.parseInt((JOptionPane.showInputDialog("Enter the 4 digit account number of the customer; "))));
					if(cust1.getAccNo()> 0000 && cust1.getAccNo() < 9999)
					{
						cust1.setForename(JOptionPane.showInputDialog("Enter The Forename Of the customer: "));	
						for(int i = 0; i < cust1.getForename().length(); i++)
						{
							
							if(!Character.isLetter(cust1.getForename().charAt(i)))
							{
								
								JOptionPane.showMessageDialog(null,"This is not a forename");
								break;
								
							}
							
							
						}
						cust1.setSurname(JOptionPane.showInputDialog("Enter the surname of the customer: "));
						for(int i = 0; i < cust1.getSurname().length(); i++)
						{
							
							if(!Character.isLetter(cust1.getSurname().charAt(i)))
							{
								
								JOptionPane.showMessageDialog(null,"This is not a Surname");
								break;
								
							}
							
							
						}
						
					 	cust1.setAddress(JOptionPane.showInputDialog("Enter the address of the customer: "));
						for(int i = 0; i < cust1.getAddress().length(); i++)
						{
							
							if(!Character.isLetter(cust1.getAddress().charAt(i)))
							{
								
								JOptionPane.showMessageDialog(null,"This is not an address");
								break;
								
							}
							
							
						}
						
						cust1.setMobileNumber(Long.parseLong((JOptionPane.showInputDialog("Enter the 9 digit phone number phone number of the customer(leave out 0); "))));
						if(cust1.getMobileNumber() >= 0000000000 && cust1.getMobileNumber() < 999999999)
						{
						
							cust1.setBalance(Long.parseLong((JOptionPane.showInputDialog("Enter the current owed blance by this customer; "))));
							if(cust1.getBalance() >= 0000000000 && cust1.getBalance() < 999999999)
							{
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
						
						
					}
					else 
					{
						
						JOptionPane.showMessageDialog(null,"You did not enter a valid Account Number");
						break;
						
					}
				
					
					
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"You've chosen item #2");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"You've chosen item #3");
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"You've chosen item #4");
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
		
	
