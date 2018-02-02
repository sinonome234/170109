import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.Container;
import java.awt.*;



public class RJRbutton extends JFrame{



   RJRbutton(String title){
   	setTitle("rrrr");
   	setBounds(222,222,222,222);
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    JRadioButton rg = new JRadioButton("ttt");
    JRadioButton rg2 = new JRadioButton("rrr");
    JRadioButton rg3 = new JRadioButton("yyy");

    JPanel pl = new JPanel();

    pl.add(rg);
    pl.add(rg2);
    pl.add(rg3);

    Container cp = getContentPane();
    cp.add(pl,BorderLayout.NORTH);
   }


	public static void main(String[] args){
		RJRbutton fu = new RJRbutton("tttt");
		fu.setVisible(true);
	}
}