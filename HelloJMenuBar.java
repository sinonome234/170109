import javax.swing.*;
import java.awt.*;



public class HelloJMenuBar extends JFrame{

	HelloJMenuBar(String title){
    setTitle(title);
    setBounds(222,222,222,222);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar mbr = new JMenuBar();

    JMenu mu1 = new JMenu("file");

    JMenuItem mit1 = new JMenuItem("new");
    JMenuItem mit2 = new JMenuItem("open");

    setJMenuBar(mbr);
    mbr.add(mu1);
    mu1.add(mit1);
    mu1.add(mit2);

	}
	public static void main(String[] args) {
		HelloJMenuBar hello = new HelloJMenuBar("title");
		hello.setVisible(true);
	}
}