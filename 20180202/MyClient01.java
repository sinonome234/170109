import  java.io.*;
import	java.net.*;
import	java.util.*;

public class MyClient01{
	public static void main(String[] args){
	
		Socket sock = null;

		try{
			sock = new Socket(6000);
		}catch(IOException e){
			System.err.println("err");
			System.exit(1);
		}
	}
}