import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server {

   public static void main(String args[]) throws Exception {
      try {
         // Instantiating the implementation class
         ImplExample obj = new ImplExample();
         
         Naming.rebind("Hello", obj);

         System.err.println("Server ready");

         System.out.println(java.net.InetAddress.getLocalHost());

      } catch (Exception e) {
         System.err.println("Server exception: " + e.toString());
         e.printStackTrace();
      }
   }
}
