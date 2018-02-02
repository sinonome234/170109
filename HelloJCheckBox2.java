import javax.swing.*;
import java.awt.*;

public class HelloJCheckBox2 extends JFrame{
HelloJCheckBox2(String title){
	setTitle(title);
	setBounds(222,222,222,222);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel pl = new JPanel();

    pl.setLayout(new GridLayout(3,1));

    JCheckBox ck = new JCheckBox("kkk",true);
    JCheckBox ck2 = new JCheckBox("ttt");
    JCheckBox ck3 = new JCheckBox("rrr");

    pl.add(ck);
    pl.add(ck2);
    pl.add(ck3);

    Container cp = getContentPane();
    cp.add(pl,BorderLayout.SOUTH);

}



	public static void main(String[] args){
		HelloJCheckBox2 hello = new HelloJCheckBox2("jjjj");
		hello.setVisible(true);
	}
}