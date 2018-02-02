import java.io.*;

public class TestScanner{
	public static void main(String args[]){
		try{

            FileWrier data = new FileWrier("data.txt",true);
            BufferedWriter bw = new BufferedWriter(data);
            userData = "";


        while(true){
          System.out.println("fff");
          userData = new Scanner(System.in).nextLine();

           if(userData.equals("exit")) break;
            
            bw.write(userData+"\n")



        }
         bw.close();
		}catch(IOException e){
           System.out.println("kkkkkkkkk");
		}
	}
}