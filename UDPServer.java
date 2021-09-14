import java.io.*;
import java.net.*;
import java.util.*;
public class UDPServer
{
  DatagramSocket ds;
  DatagramPacket dp,dp1;
  byte[] sendPacket;
  byte[] receivePacket;
  BufferedReader in;
  InetAddress ip;
  int Port;
  String str;
  UDPServer()
  {
   try
   {
     in=new BufferedReader(new InputStreamReader(System.in));
     ds=new DatagramSocket(1456);
     sendPacket=new byte[100];
     receivePacket=new byte[100];
     while(true)
     {
      sendPacket=new byte[100];
      receivePacket=new byte[100];
      dp=new DatagramPacket(receivePacket,receivePacket.length);
      ds.receive(dp);
      String data=new String(dp.getData());
      System.out.println("Client:"+data);
      System.out.print("Server: ");
      str=in.readLine();
      ip=dp.getAddress();
      Port=dp.getPort();
      sendPacket=str.getBytes();
      dp1=new DatagramPacket(sendPacket,sendPacket.length,ip,Port);
      ds.send(dp1);
      if(str.equals("exit"))
           System.exit(0);
      }
    }catch(Exception e){}
  }
public static void main(String args[])
{
   UDPServer s=new UDPServer();
}
}

