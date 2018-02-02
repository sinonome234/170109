import	java.io.*;
  import	java.net.*;
  import	java.util.*;

  public class NetClock2{
   public static void main(String[] args) throws IOException{
      byte[] buff = new byte[1024];
      ServerSocket servsocket = null;
      Socket sock;
      InputStream instr = null;
      OutputStream outstr = null;
      String str;


 try{
    servsocket = new ServerSocket(6000,200);
      while(true){
        sock = servsocket.accept();

        System.out.println("接続");

        str = + + + +;

        outstr = sock.getOutputStream();

        for(i=0; i<outstr.length(); i++)
             outstr.write((int) outstr.charAt(i));
             outstr.write('\n');













             

             sock.close();
        }

      }catch(Exception e){
        System.out.println("ネット枠エラー");
        System.exit(1);
       }
      }
     }