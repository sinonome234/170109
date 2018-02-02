import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class HelloRadioButton extends JFrame implements ActionListener{

JLabel lbl;
JRadioButton rbtn1;
JRadioButton rbtn2;
JRadioButton rbtn3;



public void actionPerformed(ActionListener e){
    	Boolean kekka1 = this.rbtn1.isSelected();
    	Boolean kekka2 = this.rbtn2.isSelected();
    	Boolean kekka3 = this.rbtn3.isSelected();

    	String msg = "";
    	if(kekka1){
    		msg = this.rbtn1.getText()+"が選択されています";
    		this.lbl.setText(msg);
    	}
    	if(kekka2){
    		msg = this.rbtn1.getText()+"が選択されています";
    		this.lbl.setText(msg);
    	}
    	if(kekka3){
    		msg = this.rbtn1.getText()+"が選択されています";
    		this.lbl.setText(msg);
    	}
    }

HelloRadioButton(String title){
	setTitle(title);
	setBounds(222,222,222,222);
	setDefaultCloseOperation(JFrame,EXIT_ON_CLOSE);


	this.rbtn1("Mac");
	this.rbtn2("Linux");
	this.rbtn1("Windows");

	ButtonGroup rBtnGroup = new ButtonGroup();
	rBtnGroup.add(rbtn1);
    rBtnGroup.add(rbtn2);
    rBtnGroup.add(rbtn3);

    }

JButton btn = new JButton("click");
btn.addActionListener(this);

this.lbl = new JLabel("kkkkkkddd");

JPanel pnl = new JPanel();
pnl.setLayout(new GridLayout(5,1));
pnl.add(rbtn1);
pnl.add(rbtn2);
pnl.add(rbtn3);
pnl.add(btn);
pnl.add(this.lbl);

Container cp = getContentPane();
cp.add(pnl,BorderLayout.NORTH);


}




public static void main(String[] args) {
	HelloRadioButton hello = new HelloRadioButton("kkkkk");
	hello.setVisible(true);
 }
}