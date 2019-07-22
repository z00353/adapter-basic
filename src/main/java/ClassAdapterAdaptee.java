public class ClassAdapterAdaptee extends Adaptee implements Target {
    public String operation() {
        System.out.println("ClassAdapterAdaptee reached");
        // Implementing the Target interface in terms of
        // (by inheriting from) the Adaptee class.
        return specificOperation();
    }
}