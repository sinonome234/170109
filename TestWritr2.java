import java.io.*;



public class TestRedir{
	public static void main(String[] args){

     File data = new File("data.txt");

	try{
        data.createNewFile();

        FileWriter fw = new FileWriter(data);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("hello");
        bw.close();







	}catch(IOException e){
       System.out.println("dddd");
	}
	}
}