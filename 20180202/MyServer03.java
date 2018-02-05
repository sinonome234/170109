  import	java.io.*;
  import	java.net.*;
  import	java.util.*;

  public class MyServer03{
  	public static void main(String[] args) {
  		byte[] data = new byte[1024];
  		InputStream instr = null;
  		ServerSocket servsocket = null;
  		Socket sock = null;

  		try{
  			servsocket = new ServerSocket(5999);
  			while(true){
  			sock = servsocket.accept();

  	        instr =sock.getInputStream();

  	        int n = instr.read(data);
  	        System.out.write(data,0,n);
             sock.close();
            }
  		}catch(IOException e){
            System.err.println("err");
            System.exit(1);
  		}
  	}
  }