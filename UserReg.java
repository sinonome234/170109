import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;




public class UserReg extends JFrame{
  UserReg(String title){
  setTitle(title);
  setBounds(222,222,222,222);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPasswordField jp = new JPasswordField("",19);

  JLabel lbl = new JLabel("mail");
  JLabel lbl2 = new JLabel("password");

  JTextField jt = new JTextField("",20);

 

  JPanel pl = new JPanel();
  pl.setLayout(new GridLayout(2,2));
  pl.add(lbl);
  pl.add(jp);
  pl.add(lbl2);
  pl.add(jt);


  Container cp = getContentPane();
  cp.add(pl,BorderLayout.NORTH);


}
	public static void main(String main[]){
		UserReg reg = new UserReg("jjjjj");
		reg.setVisible(true);
	}
}