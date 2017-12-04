import javax.swing.*;
import java.awt.*;

public class TestGui extends JFrame{
TestGui(String title);
setTitle(title);
setBounds(222,222,222,222);
setDefaultCloseOoeration(JFrame,EXIT_ON_CLOSE);


JTextField fi = new JTextField("ddd");
JPasswordField jp = new JPasswordField("aloha");

JPanel pal = new JPanel();
pal.add(fi,BorderLayout.NOUTH);
pal.add(jp,BorderLayout.NOUTH);

Container cp = getContentPane();
cp.add(pal,BorderLayout.NORH);

public static void main(String[] args){
TestGui gui = new TestGui("GUI");
gui.setVisible(true);

}
}
