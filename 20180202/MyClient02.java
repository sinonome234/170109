  import	java.io.*;
  import	java.net.*;
  import	java.util.*;

  public class MyClient02{
  	public static void main(String[] args) {
  		byte[] buff = new byte[1024];
  		Socket sock = null;
  		OutputStream os = null;


  		try{
         
         sock = new Socket(5999);

         os = sock.getOutputStream();

         String msg ="ALOHA";


  		}catch(IOException e){

          System.err.println("err");
          System.exit(1);
  		}
  	}
  }