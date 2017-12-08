import javax.swing.*;
import java.awt.*;

public class JCheckBox extends JFrame{
  JCheckBox(String title){
    setTitle(title);
    setBounds(222,222,222,222);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel pl = new JPanel();

    JCheckBox chek1 = new JCheckBox("kkkk1");
    JCheckBox chek2 = new JCheckBox("kkkk2");
    JCheckBox chek3 = new JCheckBox("kkkk3");

   pl.add(chek1);
   pl.add(chek2);
   pl.add(chek3);

   Container cp = getContentPane();
   cp.add(pl,BorderLayout.CENTER);


  }
	public static void main(String args[]){
      JCheckBox chek = new JCheckBox("jjjj");
      chek.setVisible(true);
	}
}