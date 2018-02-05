  import	java.io.*;
  import	java.net.*;
  import	java.util.*;

  public class MyClient03{
  	public static void main(String[] args) {
      byte[] buff = new byte[1024];
     Socket sock = null;
     InputStream instr= null;

     try{
      sock = new Socket("127.16.21.42",6000);
      instr = sock.getInputStream();


       int n = instr.read(buff);
       System.out.write(buff,0,n);
       sock.close();
      
      
     }catch(IOException e ){
      System.err.println("err");
      System.exit(1);
     }
  	}
  }