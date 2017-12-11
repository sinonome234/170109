import javax.swing.*;
import java.awt.*;

public class HelloJCheckBox extends JFrame{
HelloJCheckBox(String title){
	setTitle(title);
	setBounds(222,222,222,222);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel pl = new JPanel();

    JCheckBox ck = new JCheckBox("kkk");
    JCheckBox ck2 = new JCheckBox("ttt");
    JCheckBox ck3 = new JCheckBox("rrr");

    pl.add(ck);
    pl.add(ck2);
    pl.add(ck3);

    Container cp = getContentPane();
    cp.add(pl,BorderLayout.SOUTH);

}



	public static void main(String[] args){
		HelloJCheckBox hello = new HelloJCheckBox("jjjj");
		hello.setVisible(true);
	}
}