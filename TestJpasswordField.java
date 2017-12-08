import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JPasswordFiled;

public class TestJPasswordField extends JFrame{
  TestJPasswordField(String title){
  	setTitle(title);
  	setBounds(222,222,222,222);
  	setDefaultCloseOperation(JFrame,EXIT_ON_CLOSE);

    JPasswordFiled field = new JPasswordFiled("alaha",10);

    JPanel pl = new JPanel();
    pl.add(field);

    Container cp = new getContentPane();
    cp.add(pl,BorderLayout.SOUTH);



  }



	public static void main(String args[]){
      TestJPasswordField test = new TestJPasswordField();
      test.setVisible(true);
	}
}