import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello2 extends JFrame{
     Hello2(Stirng title){
     	setBounds(222,222,222,222);
     	setTitle("Hello2");
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     	JTextField fr new = JTextField("kkkkkk");

     	Container cp new = Container();
     	cp.add(fr,BorderLayout.SOUTH);
     }
	public static void main(String[] args){
       Hello2 hello new = hello("aloha");
       hello.setVisible(true);
	}
}