import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementing the remote interface
public class ImplExample extends UnicastRemoteObject implements Hello {

	protected ImplExample() throws RemoteException {
		super();
	}

	// Implementing the interface method
	@Override
	public void printMsg() {
		System.out.println("This is an example RMI program");
	}
}
