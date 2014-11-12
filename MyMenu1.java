import javax.swing.*;
import java.awt.event.*;

	public class MyMenu1 extends JFrame
{
	
	private	JMenuBar menubar;
	private JMenuBar character;
	
	public MyMenu1()	{
		
		setTitle("My Gui");
		setSize(300,300);
		setLocation(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		createFileMenu();
		createCharacterMenu();
		
		
		
	}
	
	public void createFileMenu() {
		
		
		JMenu filemenu = new JMenu("File");
		menubar.add(filemenu);
		MyHandler handler = new MyHandler();
		
		JMenuItem openItem = new JMenuItem("Open");
		filemenu.add(openItem);
		openItem.addActionListener(handler);
		
		JMenuItem closeItem = new JMenuItem("Close");
		filemenu.add(closeItem);
		closeItem.addActionListener(handler);
		
		JMenuItem saveItem = new JMenuItem("Save As");
		filemenu.add(saveItem);
		saveItem.addActionListener(handler);
		filemenu.addSeparator();
		
		JMenuItem quitItem = new JMenuItem("Quit");
		filemenu.add(quitItem);
		quitItem.addActionListener(handler);
		
		}
		
	public void createCharacterMenu() {
		
		JMenu charactermenu = new JMenu("Edit");
		menubar.add(charactermenu);
		MyHandler1 handler = new MyHandler1();
		
		JMenuItem addItem = new JMenuItem("Add");
		charactermenu.add(addItem);
		addItem.addActionListener(handler);
		
		JMenuItem  removeItem = new JMenuItem("Remove");
		charactermenu.add(removeItem);
		removeItem.addActionListener(handler);
		
		
		
		
		
		
	}
	
	public static void main(String args[]) {
		
		Mymenu menu = new Mymenu();
		menu.setVisible(true);
	}
	
/*	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Open")) {
			
			JOptionPane.showMessageDialog(null,"you clicked open","",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if(e.getActionCommand().equals("Close")) {
			
			JOptionPane.showMessageDialog(null,"you clicked close","",JOptionPane.INFORMATION_MESSAGE);
	}
	
	else if(e.getActionCommand().equals("Save As")) {
			
			JOptionPane.showMessageDialog(null,"you clicked Save As","",JOptionPane.INFORMATION_MESSAGE);
	
	}
	else if(e.getActionCommand().equals("Quit")) {
			
			JOptionPane.showMessageDialog(null,"you clicked Quit","",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);

		}
		
		
		
}//close actionPerformed */

public class MyHandler implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Open")) {
			
			JOptionPane.showMessageDialog(null,"you clicked open","",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if(e.getActionCommand().equals("Close")) {
			
			JOptionPane.showMessageDialog(null,"you clicked close","",JOptionPane.INFORMATION_MESSAGE);
	}
	
	else if(e.getActionCommand().equals("Save As")) {
			
			JOptionPane.showMessageDialog(null,"you clicked Save As","",JOptionPane.INFORMATION_MESSAGE);
	
	}
	else if(e.getActionCommand().equals("Quit")) {
		
		JOptionPane.showMessageDialog(null,"you clicked Quit","",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
			

		}
	
}


		
}//close MyHandler

public class MyHandler1 implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Add")) {
			
			JOptionPane.showMessageDialog(null,"you clicked add","",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if(e.getActionCommand().equals("Remove")) {
			
			JOptionPane.showMessageDialog(null,"you clicked close","",JOptionPane.INFORMATION_MESSAGE);
	}
	
	}
}
}//close class