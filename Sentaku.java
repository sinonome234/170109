import javax.swing.*;
import java.awt.Container;
import java.awt.*;



public class Sentaku extends JFrame{

   JLabel rg;

   Sentaku(String title){
   	setTitle("rrrr");
   	setBounds(222,222,222,222);
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
     this.rg = new JLabel("ttt");

    JButton jb = new JButton("rrr");

    JPanel pl = new JPanel();
    
    JRadioButton bt = new JRadioButton("eee");

    JCheckBox ck = new JCheckBox("uuu");


    pl.add(this.rg);
    pl.add(bt);
    pl.add(jb);
    pl.add(ck);

    Container cp = getContentPane();
    cp.add(pl,BorderLayout.NORTH);
   }

   public actionPerformed(ActionEvent e){

   if(this.bt.isSelected()){
     this.rg.setText(jb.getText()+"chek");
   } else{
     this.rg.setText("ssss");
   }else(this.ck.isSelected()){
    this.rg.setText(ck.getText()+"chek");
   }



   }


	public static void main(String[] args){
		Sentaku fu = new Sentaku("tttt");
		fu.setVisible(true);
	}
}