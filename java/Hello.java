import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;




public class Hello extends JFrame{
  Hello(String Title){
   setTitle(title);
   setBounds(222,222,222,222);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   JButton btn = new JButton("cliic");
   JPanel.add(btn);

   Container cp = getContentPane();
   cp.add(panel,BorderLayout.CENTER);
  }
	public static void main(String[] args){
      Hello hello = new Hello("ALOHA");
      hello.setVisible(true);
	}
}