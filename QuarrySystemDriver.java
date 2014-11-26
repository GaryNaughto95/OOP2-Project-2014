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
		
	
