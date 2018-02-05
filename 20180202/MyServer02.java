  import	java.io.*;
  import	java.net.*;
  import	java.util.*;

 public class MyServer02{
  	public static void main (String[] args) {
  		ServerSocket servsocket = null;
  		Socket sock= null;

  		try{
  			servsocket = new ServerSocket(6000);
  			while(true){
  			sock = servsocket.accept();
  			System.out.println("接続");
  			InetAddress iaClient = sock.getInetAddress();
  			String ipClient = iaClient.toString();
  			System.out.println("クライアントIP"+ipClient);
  			sock.close();
  		 }
  		}catch(IOException e){
  			System.err.println("err");
  			System.exit(1);
  		}
  	}
  }