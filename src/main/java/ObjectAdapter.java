public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public String operation() {
        System.out.println("ObjectAdapter reached ");
        // Implementing the Target interface in terms of
        // (by delegating to) an Adaptee object.
        return adaptee.specificOperation();
    }
}