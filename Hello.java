import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{
   Hello(String title){
   	setTitle(title);
   	setBounds(222,222,222,222);
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
	public static void main(String args[]){
	Hello hello = new Hello("kkkk");
	hello.setVisible(true);
	}
}