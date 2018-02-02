import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
   
   public class HelloJCheckBox3 extends JFrame implements ActionListener{
    JCheckBox[] check;
    JLabel[] lbl;
   
    public static void main(String[] args) {
        HelloJCheckBox3 frame = new HelloJCheckBox3("CHECKBOX");
        frame.setVisible(true);
    }
   
    HelloJCheckBox3(String title){
        setTitle(title);
        setSize(400,300);
        setLocation(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        check = new JCheckBox[3];
        check[0] = new JCheckBox("JAVA");
        check[1] = new JCheckBox("PYTHON");
        check[2] = new JCheckBox("C/C++");
        
        lbl = new JLabel[3];
        lbl[0] = new JLabel();
        lbl[1] = new JLabel();
        lbl[2] = new JLabel();
   
        JPanel pnl = new JPanel();
        JPanel msg = new JPanel();
        pnl.setLayout(new GridLayout(1,3));
        msg.setLayout(new GridLayout(1,3));
        for(int i = 0; i<3 ; i++){
            pnl.add(check[i]);
            msg.add(lbl[i]);
        }

        JButton button = new JButton("OK");
        button.addActionListener(this);
        JPanel pnlbutton = new JPanel();
        pnlbutton.add(button);
   
        Container cont = getContentPane();
        cont.add(pnl, BorderLayout.NORTH);
        cont.add(msg, BorderLayout.CENTER);
        cont.add(pnlbutton, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("CLICK!!");
        if(this.check[0].isSelected()){
            this.lbl[0].setText(this.check[0].getText()+"選択");
        }else {
            this.lbl[0].setText("");
        }
        if(this.check[1].isSelected()){
            this.lbl[1].setText(this.check[1].getText()+"選択");
        }else {
            this.lbl[1].setText("");
        }
        if(this.check[2].isSelected()){
            this.lbl[2].setText(this.check[2].getText()+"選択");
        }else {
            this.lbl[2].setText("");
        }
    }
   }