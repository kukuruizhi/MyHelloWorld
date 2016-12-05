package src;
import java.io.*;

public class Write {
	      public static void main(String args[])
	      {
	          try
	          {
	             FileOutputStream fos = new FileOutputStream("abc");
	             DataOutputStream dos = new DataOutputStream(fos);
	             dos.writeByte(12);
	             fos.write(100);
	             fos.close();
	             dos.close();
	
	             FileInputStream fis = new FileInputStream("abc");
	             DataInputStream dis = new DataInputStream(fis);
	             byte b = dis.readByte();
	             System.out.print(b + " ");
	             int i = dis.readInt();
	             System.out.println(i);
	             fis.close();
	             dis.close();
	        }
	         catch(IOException e)
	         {
	             System.out.println("An exception occurred");
	         }
	     }


}
