package moonlodge.frontend.moonlodgefrontend.registry;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestRegistry {

    public static Registry registry;
    public TestRegistry(){}
    private final int PORT = 1099;

    public static void main(String[] args) {
        try {

            registry = LocateRegistry.createRegistry(1099);


        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
