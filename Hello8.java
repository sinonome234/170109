import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
   
   public class Hello8 extends JFrame implements ActionListener{
    JTextField  jf = new JTextField(10);
    public static void main(String[] args) {
        Hello8 frame = new Hello8("CHECKBOX");
        frame.setVisible(true);
    }
   
    Hello8(String title){
        setTitle(title);
        setSize(400,300);
        setLocation(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JButton jb = new JButton("Hello");
        jb.addActionListener(this);
        JPanel pnl = new JPanel();

        pnl.add(jb);
        pnl.add(jf);

        Container cp = getContentPane();
        cp.add(pnl,BorderLayout.NORTH);
    }
    public void actionPerformed(ActionEvent e){
      jf.setText("Hello");
    }
   }