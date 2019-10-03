
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;  
import java.awt.event.*;
import java.awt.FlowLayout;  

public class Client1 
{
	public static void main(String ar[])	
	{
			JFrame frame = new JFrame("JFrame Example");
			JLabel label = new JLabel("hello");
			JTextField text = new JTextField(10);
			JButton button = new JButton();  
			button.setBounds(100,50,100,100);
			button.setText("Button");  
			frame.add(label);
        	frame.add(text);
        	frame.add(button);
        	frame.setSize(400,400);  
        	frame.setLayout(new FlowLayout());  
        	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        	frame.setVisible(true);
        	button.addActionListener(new ActionListener()
        	{ 
        		public void actionPerformed(ActionEvent e)
    			{  
    				try		
					{
						//192.168.39.123
		        		String s1=text.getText();  
		        		Socket client = new Socket("192.168.39.123",9999);
						DataInputStream fromserver = new DataInputStream(client.getInputStream());
						PrintWriter toserver = new PrintWriter(client.getOutputStream(),true);
						String name = text.getText();  
						label.setText(name);
						toserver.println(name);
						Scanner sc1 = new Scanner(fromserver);
						String area = sc1.nextLine();
						System.out.println(area);
					}
					catch(IOException e1){
						System.out.println(e1);
					}
    		}});   
	}
}
