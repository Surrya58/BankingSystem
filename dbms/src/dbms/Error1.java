package dbms;

import java.awt.*;
import java.awt.event.*;

public class Error1 extends Frame 
{
	Button B1;
	Label L1;
	Error1()
	{
		super("ERROR WINDOW");

		L1=new Label("Error occured, please check the value entered");
		Font F1 = new Font("Serif",Font.BOLD,20);
		L1.setFont(F1);
		
		B1=new Button("back");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Signin();
	     }
		});
 
		add(L1);
		
		
		add(B1);
		
		
		addWindowListener(new WindowAdapter()
		{
	        public void windowClosing(WindowEvent x)
	        {
	          dispose();
	        }
		});
		
		setBackground(Color.CYAN);
		setLayout(new FlowLayout());
		setSize(800,600);
		setVisible(true);

    }
}

