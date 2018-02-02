public class Fukushu extends JFrame{



   Fukushu(title){
   	setTitle("rrrr");
   	setBounds(222,222,222,222);
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar mr = new JMenuBar();

    setJMenuBar(mr);

    JMenu fileMenu1 = new JMenu("File");
    
    setJMenu(fileMenu1);

     JMenu fileMenu2 = new JMenu("Edit");
    
    setJMenu(fileMenu2);

    JMenu fileMenu3 = new JMenu("Help");
    
    setJMenu(fileMenu3);



    JMenuItem newFile1 =new JMenuItem("new");
    JMenuItem newFile1 =new JMenuItem("open");
    JMenuItem newFile1 =new JMenuItem("close");

    JMenuItem newFile2 =new JMenuItem("cut");
    JMenuItem newFile2 =new JMenuItem("copy");
    JMenuItem newFile2 =new JMenuItem("paset");

    JMenuItem newFile3 =new JMenuItem("version");
    JMenuItem newFile3 =new JMenuItem("index");

    fileMenu1.add(newFile1);
    fileMenu1.add(newFile1);
    fileMenu1.add(newFile1);
    fileMenu2.add(newFile2);
    fileMenu2.add(newFile2);
    fileMenu2.add(newFile2);
    fileMenu3.add(newFile3);
    fileMenu3.add(newFile3);

    mr.add(fileMenu1);
    mr.add(fileMenu1);
    mr.add(fileMenu1);
    mr.add(fileMenu2);
    mr.add(fileMenu2);
    mr.add(fileMenu2);
    mr.add(fileMenu3);
    mr.add(fileMenu3);



   }


	public static void main(String[] args){
		Fukushu fu = new Fukushu("tttt");
		fu.setVisible(true);
	}
}