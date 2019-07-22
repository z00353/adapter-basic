public class Client {
    // Running the client class as application
    public static void main(String[] args) {
        // Creating an object adapter
        // and configuring it with an Adaptee object.
        Target objectAdapter = new ObjectAdapter (new Adaptee());
        System.out.println("(1) Object Adapter: " + objectAdapter.operation());

        // Creating a class adapter
        // that commits to the Adaptee class at compile-time.
        Target classAdapter = new ClassAdapterAdaptee();
        System.out.println("(2) Class Adapter : " + classAdapter.operation());
    }
}
