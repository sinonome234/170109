import java.io.*;



public class TestWritr{
	public static void main(String[] args){


	try{

        FileReader fw = new FileWriter("data.txt");
        BufferedWriter br = new BufferedWriter(fw);

        String msg = br.readLine();
        System.out.println("Hello");
        System.out.println(msg);


	}catch(IOException e){
       System.out.println("dddd");
	}
	}
}