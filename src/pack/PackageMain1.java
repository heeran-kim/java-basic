package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // A path is not needed when the class is in the same package
        pack.a.User user = new pack.a.User(); // otherwise, the full name, including path, is needed
    }
}
