import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;


public class Client {

	public static void main(String[] args) {
		String hostname = args[0];

		try {
			Hello obj = (Hello)Naming.lookup("rmi://" + hostname + "/Hello");

			int[] b=obj.generate();
			obj.registerclient();
			System.out.println(Arrays.toString(b)); // print array of generated numbers

		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
