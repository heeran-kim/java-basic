package pack;

/*import pack.a.User;
import pack.a.User2;*/

import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // A path is not needed when the class is in the same package
        // pack.a.User user = new pack.a.User(); // otherwise, the full name, including path, is needed
        User user = new User(); // when the class is imported, the full name is not needed.
        User2 user2 = new User2();
    }
}
