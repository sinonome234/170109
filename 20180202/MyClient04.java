    import java.io.*;
    import java.net.*;
 
    public class MyClient04{
    public static void main(String[] args){
    Socket sock;
    byte[] buff = new byte[1024];
    OutputStream os = null;


      try{
      sock = new Socket(args[0],Integer.parseInt(args[1]));
      os = sock.getOutputStream();
 
  String msg = "170109"+ "\n"
             + "sinonome234" + "\n"
             + "My name is kaito_kuroki";
 
      os.write(msg.getBytes());
      os.write(buff);
 
      sock.close();
    }catch(Exception e){
      System.out.println("失敗");
   }
  }
 }