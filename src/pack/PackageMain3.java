package pack;

/*import pack.a.User;
import pack.a.User2;*/

import pack.a.*;
import pack.a.User;
// import pack.b.*;
// less frequently used class shouldn't be imported.
// if there is another class w/ the same class name.

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // If there are multiple class with the same name,
        // then full name is needed for the less frequently used one.
    }
}
